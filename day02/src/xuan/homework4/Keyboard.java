package xuan.homework4;

public class Keyboard implements USB {

    @Override
    public void connect() {
        System.out.println("连接上了键盘....");
    }

    @Override
    public void exit() {
        System.out.println("拔出了键盘....");
    }

    public void input() {
        System.out.println("使用了键盘输入了 HelloWorld");
    }
}
