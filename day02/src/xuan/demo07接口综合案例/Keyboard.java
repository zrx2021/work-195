package xuan.demo07接口综合案例;

// 定义Keyboard键盘类实现USB接口
public class Keyboard implements USB {

    @Override
    public void connect() {
        System.out.println("键盘连接成功...");
    }

    // 键盘特有方法敲击
    public void type() {
        System.out.println("疯狂的敲击键盘...");
    }
}
