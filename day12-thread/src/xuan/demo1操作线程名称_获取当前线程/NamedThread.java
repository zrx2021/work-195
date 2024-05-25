package xuan.demo1操作线程名称_获取当前线程;

public class NamedThread extends Thread {
    // Thread(String name)
    public NamedThread(String name) {
        // 调用父类带参数的构造器
        super(name);
    }

    @Override
    public void run() {
        // 获取线程的名称
        System.out.println("新线程的名称: " + getName());

        // 获取当前线程，新线程执行这个方法，返回新线程
        Thread thread = Thread.currentThread();
        System.out.println("thread run = " + thread); // Thread[卖油条,5,main]
        System.out.println("线程名称 run = " + thread.getName()); // 卖油条
    }
}
