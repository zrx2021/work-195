package xuan.demo05继承Thread类创建线程;

/*
目标：继承Thread类创建线程
    多线程程序每次执行效果可能不同（CPU在多个线程之间随机切换）
 */
public class Demo5 {
    // 线程执行main，执行main方法的线程叫主线程（线程名字叫main）
    public static void main(String[] args) {
        // 3.创建子类对象
        MyThread myThread = new MyThread();

        // 4.调用start()方法启动新的线程，新的线程会执行run()方法
        // 一个线程只能执行一次start()方法
        // 如果调用run()方法，是普通的方法调用，没有启动新的进程
        myThread.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
