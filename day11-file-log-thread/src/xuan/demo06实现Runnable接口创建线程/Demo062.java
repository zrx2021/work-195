package xuan.demo06实现Runnable接口创建线程;

/*
目标: 实现Runnable接口创建线程
 */
public class Demo062 {
    public static void main(String[] args) {
        // 3.创建Runnable实现类对象
        MyThread mt = new MyThread();

        // 4.创建Thread对象，构造器传入Runnable实现类对象
        // Thread(Runnable target)
        Thread thread = new Thread(mt);
        thread.start();

        // 5.启动新的线程，新线程执行构造器参数mr对象的run方法
        for (int i = 0; i < 20; i++) {
            System.out.println("main: " + i);
        }
    }
}
