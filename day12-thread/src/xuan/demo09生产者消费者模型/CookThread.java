package xuan.demo09生产者消费者模型;

// 创建生产者（生产包子）
public class CookThread extends Thread{
    private Desk desk;

    public CookThread(String name, Desk desk) {
        super(name);
        this.desk = desk;
    }

    @Override
    public void run() {
        // 厨师生产包子
        while (true) {
            desk.put();
        }
    }
}
