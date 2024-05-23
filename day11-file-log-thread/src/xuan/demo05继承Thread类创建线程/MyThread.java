package xuan.demo05继承Thread类创建线程;

// 1.定义子类继承Thread类
public class MyThread extends Thread {
    // 2.重写run方法，写要在新线程上面执行的代码（任务）
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
