package xuan.demo03线程join;

public class MyThread02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("MyThread02：" + i);
        }
    }
}
