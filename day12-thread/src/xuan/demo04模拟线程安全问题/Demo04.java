package xuan.demo04模拟线程安全问题;

/*
目标：使用程序模拟线程安全问题

实现步骤：
    1.定义一个账户类包含卡号、余额和取钱方法，接着创建一个账户对象代表2个人的共享账户
    2.定义一个线程类（用于创建两个线程，分别代表小明和小红）
    3.创建2个线程，传入同一个账户对象给2个线程处理
    4.启动2个线程，同时去同一个账户对象中取钱10万
 */
public class Demo04 {
    public static void main(String[] args) {
        // 接着创建一个账户对象代表2个人的共享账户
        Account account = new Account("账户名称", 100000);

        // 3.创建2个线程，传入同一个账户对象给2个线程处理
        DrawThread dt1 = new DrawThread("小明", account);
        DrawThread dt2 = new DrawThread("小红", account);

        // 4.启动2个线程，同时去同一个账户对象中取钱10万
        dt1.start();
        dt2.start();
    }
}
