package xuan.demo09生产者消费者模型;

/*
目标: 线程通信案例：吃包子案例（了解代码，理解思想）

    生产者(厨师)
        没有包子: 生产包子.通知消费者,自己等待
        有包子:通知消费者,自己等待

    消费者(吃货)
        有包子:吃掉包子,通知生产者,自己等待
        没有包子: 通知生产者,自己等待

    创建桌子, 把包子放到桌子上的方法, 从桌子上获取包子的方法
    创建消费者(吃包子)
    创建生产者(生产包子)
 */
public class Demo09 {
    public static void main(String[] args) {
        // 创建所有线程共享桌子
        Desk desk = new Desk();

        // 创建生产者——厨师
        CookThread ct1 = new CookThread("厨师1", desk);
        CookThread ct2 = new CookThread("厨师2", desk);
        CookThread ct3 = new CookThread("厨师3", desk);

        // 创建消费者——吃货
        EatThread et1 = new EatThread("吃货1", desk);
        EatThread et2 = new EatThread("吃货2", desk);

        // 启动线程
        ct1.start();
        ct2.start();
        ct3.start();
        et1.start();
        et2.start();
    }
}
