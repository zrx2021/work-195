package xuan.demo10线程池;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "任务执行完毕！");
    }
}
