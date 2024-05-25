package xuan.demo1操作线程名称_获取当前线程;

public class Demo01 {
    public static void main(String[] args) {
        // 获取当前线程, 主线程执行这个方法, 返回主线程
        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread); // Thread[main,5,main]
        System.out.println("线程名称 = " + thread.getName()); // main

        // 创建线程
        NamedThread nt = new NamedThread("卖油条");

        // 设置线程的名称
        // nt.setName("卖包子");

        // 启动线程
        nt.start();
    }
}
