package xuan.demo10线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
目标：线程池的使用方式1-实现Runnable接口
    1.创建线程池
    2.创建Runnable任务
    3.提交任务
 */
public class Demo101 {
    public static void main(String[] args) {
        // 1.创建线程池，线程池中有3个线程
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 2.创建Runnable任务
        MyRunnable mr = new MyRunnable();

        // 3.提交任务，线程池就会派内部的线程来执行任务
        pool.submit(mr);
        pool.submit(mr);
        pool.submit(mr);
        pool.submit(mr);
        pool.submit(mr);

        // 4.关闭线程池，等任务执行完毕才会关闭线程池
        // 若不关闭线程池，程序不会停止运行
        pool.shutdown();
    }
}
