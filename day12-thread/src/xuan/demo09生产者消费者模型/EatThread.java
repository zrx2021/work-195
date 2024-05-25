package xuan.demo09生产者消费者模型;

// 创建消费者（吃包子）
public class EatThread extends Thread{
    private Desk desk;

    public EatThread(String name, Desk desk) {
        super(name);
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            // 吃货吃包子
            desk.get();
        }
    }
}
