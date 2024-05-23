package xuan.demo07Callable加FutureTask实现多线程;

import java.util.concurrent.Callable;

// 定义类实现Callable
public class MyCallable implements Callable<Integer> {
    // 2.重写call方法
    @Override
    public Integer call() throws Exception {
        System.out.println("执行完了Call，返回结果！");
        return 123456;
    }
}
