package xuan.demo08操作线程名称_获取当前线程;

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
    }
}
