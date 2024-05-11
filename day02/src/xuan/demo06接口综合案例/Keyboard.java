package xuan.demo06接口综合案例;

public class Keyboard implements USB {

    @Override
    public void connect() {
        System.out.println("键盘连接");
    }

    public void type() {
        System.out.println("疯狂的敲击键盘……");
    }
}
