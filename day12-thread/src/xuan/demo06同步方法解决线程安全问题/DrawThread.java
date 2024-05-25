package xuan.demo06同步方法解决线程安全问题;

// 2.定义一个线程类（用于创建两个线程，分别代表小明和小红）
public class DrawThread extends Thread {
    // 拥有的账户
    private Account account;

    // 用构造器给成员变量赋值
    public DrawThread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 使用账户取钱
        account.drawMoney(100000);
    }
}
