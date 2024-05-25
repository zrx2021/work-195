package xuan.homework3;

import java.util.Random;
import java.util.concurrent.Callable;

public class SumCallable implements Callable<Double> {
    @Override
    public Double call() throws Exception {
        Random r = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += r.nextInt(100) + 1;
        }

        return sum / 10.0;
    }
}
