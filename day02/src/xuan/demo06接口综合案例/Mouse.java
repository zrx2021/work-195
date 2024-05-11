package xuan.demo06接口综合案例;

public class Mouse implements USB {

    @Override
    public void connect() {
        System.out.println("鼠标连接");
    }

    public void click() {
        System.out.println("拼命点击鼠标……");
    }
}
