package xuan.demo03线程join;

/*
定义3个线程,分别打印A,B,C
启动这3个线程, 一定要确保打印顺序为ABC
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("a"), "测试1");
        Thread t2 = new Thread(() -> {
            try {
                t1.join(); // t1(打印a)执行完才能打印b
                System.out.println("b");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                t2.join(); // t2(打印b)执行完才能打印c
                System.out.println("c");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t3.start();
        t2.start();
        t1.start();
    }
}
