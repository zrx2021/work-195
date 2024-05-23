package xuan.demo07Callable加FutureTask实现多线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
目标：Callable加FutureTask实现多线程
 */
public class Demo07 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 3.创建Callable实现类对象
        MyCallable mc = new MyCallable();

        // 4.创建FutureTask对象，保存call方法的返回值
        FutureTask<Integer> ft = new FutureTask<>(mc);

        // 5.创建线程对象
        Thread t = new Thread(ft);

        // 6.启动新的线程，新的线程会执行Thread构造器ft对象包装mc的Callable方法
        // 线程执行完毕call方法，把返回值保存ft对象中
        t.start();

        // 7.获取返回值
        Integer ret1 = ft.get();
        System.out.println("ret1 = " + ret1);
    }
}
