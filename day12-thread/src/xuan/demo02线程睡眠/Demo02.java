package xuan.demo02线程睡眠;

public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println("a");
        // Thread.sleep(1000);
        // System.out.println("b");
        // Thread.sleep(1000);
        // System.out.println("c");

        // 10秒倒计时
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
