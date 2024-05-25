package xuan.homework2;

import java.util.concurrent.*;

public class Demo1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        CalcThread ct1 = new CalcThread(1, 500000);
        CalcThread ct2 = new CalcThread(500001, 800000);
        CalcThread ct3 = new CalcThread(800001, 1000000);

        Future<Long> ret1 = pool.submit(ct1);
        Future<Long> ret2 = pool.submit(ct2);
        Future<Long> ret3 = pool.submit(ct3);

        try {
            Long long1 = ret1.get();
            Long long2 = ret2.get();
            Long long3 = ret3.get();

            System.out.println("1到500000的总和为:" + long1);
            System.out.println("500001到800000的总和为:" + long2);
            System.out.println("800001到1000000的总和为:" + long3);
            System.out.println("1到1000000的总和为:" + (long1 + long2 + long3));

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            pool.shutdown();
        }
    }
}
