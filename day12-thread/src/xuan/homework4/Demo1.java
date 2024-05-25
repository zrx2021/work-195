package xuan.homework4;

public class Demo1 {
    public static void main(String[] args) {
        RedWarRunnable rwr = new RedWarRunnable();

        Thread t1 = new Thread(rwr, "郭靖");
        Thread t2 = new Thread(rwr, "瑛姑");
        Thread t3 = new Thread(rwr, "周伯通");
        Thread t4 = new Thread(rwr, "黄药师");
        Thread t5 = new Thread(rwr, "黄蓉");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
