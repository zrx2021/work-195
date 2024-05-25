package xuan.demo08线程通信API;

/*
目标:学习等待和唤醒
    wait和notify必须要在同步代码块中使用锁对象调用

    面试题:wait和sleep的区别
        1.wait线程进入等待, 会释放锁
        2.sleep线程进入睡眠, 不会释放锁
 */
public class Demo08 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        System.out.println("等待前");
                        obj.wait();
                        System.out.println("等待后");
                    } catch (InterruptedException e) {}
                }
            }
        }).start();

        Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    System.out.println("准备唤醒");
                    obj.notify();
                }
            }
        }).start();
    }
}
