package xuan.demo10线程池;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
目标：线程池的使用方式1-实现Callable接口
    1.创建线程池
    2.创建Callable任务
    3.提交任务
 */
public class Demo102 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1.创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 2.创建Callable对象
        MyCallable mc1 = new MyCallable(100);
        MyCallable mc2 = new MyCallable(200);

        // 3.提交任务，线程池会派线程执行call()方法，把返回值放到Future对象中
        // 通过Future对象的get()方法获取到返回值
        Future<Integer> f1 = pool.submit(mc1);
        Integer ret1 = f1.get();
        System.out.println("ret1 = " + ret1);

        Future<Integer> f2 = pool.submit(mc2);
        Integer ret2 = f2.get();
        System.out.println("ret2 = " + ret2);

        pool.shutdown();
    }
}
