package xuan.demo06同步方法解决线程安全问题;

// 1.定义一个账户类包含卡号、余额和取钱方法，接着创建一个账户对象代表2个人的共享账户
public class Account {
    // 卡号
    private String cardId; // 卡号
    // 余额
    private double money; // 余额

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    // 取钱方法
    public synchronized void drawMoney(double money) {
        // 哪个线程来取钱，获取线程名称
        String name = Thread.currentThread().getName();
        System.out.println(name + " this = " + this);

        // 判断钱是否足够
        if (this.money >= money) {
            // 如果钱足够就取钱
            System.out.println(name + "准备取钱" + money);
            // 账户减钱
            this.money -= money;
            System.out.println(name + "取钱成功，余额为：" + this.money);
        } else {
            // 如果钱不够，就不取钱
            System.out.println(name + "取钱失败，余额不足");
        }
    }
}
