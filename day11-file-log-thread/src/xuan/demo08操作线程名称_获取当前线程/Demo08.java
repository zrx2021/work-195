package xuan.demo08操作线程名称_获取当前线程;

public class Demo08 {
    public static void main(String[] args) {
        // 创建线程
        NamedThread nt = new NamedThread("卖油条");

        // 设置线程的名称
        // nt.setName("卖包子");

        // 启动线程
        nt.start();
    }
}
