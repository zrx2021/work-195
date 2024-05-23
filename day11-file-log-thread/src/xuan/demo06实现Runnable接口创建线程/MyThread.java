package xuan.demo06实现Runnable接口创建线程;

// 1.定义类实现Runnable接口
public class MyThread implements Runnable {
    // 2.重写run方法，编写新线程要执行的代码（任务）
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run: " + i);
        }
    }
}
