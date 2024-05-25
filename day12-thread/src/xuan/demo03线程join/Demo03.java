package xuan.demo03线程join;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 mt01 = new MyThread01();
        MyThread02 mt02 = new MyThread02();

        mt01.start();
        // 需求: 让mt01执行完毕才开始执行mt02
        // mt01.join()：让mt01执行完毕再执行后面代码
        mt01.join();
        mt02.start();

        // 需求：让mt02执行完毕才开始执行mt01
        // mt02.start();
        // mt02.join();
        // mt01.start();
    }
}
