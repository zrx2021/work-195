package xuan.homework3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        SumCallable sc = new SumCallable();

        Future<Double> ret1 = pool.submit(sc);
        Future<Double> ret2 = pool.submit(sc);
        Future<Double> ret3 = pool.submit(sc);

        try {
            Double val1 = ret1.get();
            Double val2 = ret2.get();
            Double val3 = ret3.get();

            double average = (val1 + val2 + val3) / 3.0;
            System.out.println("average = " + average);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            pool.shutdown();
        }
    }
}
