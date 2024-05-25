package xuan.demo09生产者消费者模型;

import java.util.ArrayList;
import java.util.List;

// 创建桌子, 把包子放到桌子上的方法, 从桌子上获取包子的方法
public class Desk {
    // 定义集合保存包子
    private List<String> list = new ArrayList<>();
    private int num = 1;

    // 生产者(厨师): 存放包子
    public synchronized void put() {
        // 获取线程的名称
        String name = Thread.currentThread().getName();

        try {
            if (list.size() == 0) {
                // 没有包子: 生产包子
                list.add("包子" + num++);
                System.out.println(name + " 生产了一个包子: " + list);
                // 通知消费者
                this.notifyAll();
                // 自己等待
                this.wait();
            } else {
                // 有包子：通知消费者，自己等待
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {

        }
    }

    // 消费者(吃货): 获取包子
    public synchronized void get() {
        // 获取线程的名称
        String name = Thread.currentThread().getName();

        try {
            if (list.size() != 0) {
                // 有包子：吃掉包子
                String baoZi = list.remove(0);
                System.out.println(name + " 吃掉了包子" + baoZi);
                // 通知生产者
                this.notifyAll();
                // 自己等待
                this.wait();
            } else {
                // 没有包子：通知生产者，自己等待
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {}
    }
}
