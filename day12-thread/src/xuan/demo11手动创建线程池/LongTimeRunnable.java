package xuan.demo11手动创建线程池;

public class LongTimeRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "执行任务啦！");
            Thread.sleep(1000000);
            System.out.println("\t" + Thread.currentThread().getName() + "任务结束啦！");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
