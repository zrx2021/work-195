package xuan.demo10线程池;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "任务执行完毕");

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // i = 1, 2, 3, ... n
            sum += i;
        }
        return sum;
    }
}
