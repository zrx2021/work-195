package xuan.homework2;

import java.util.concurrent.Callable;

public class CalcThread implements Callable<Long> {
    private long start;
    private long end;

    public CalcThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
