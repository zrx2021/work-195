package xuan.demo07接口综合案例;

// 定义Mouse鼠标类实现USB接口
public class Mouse implements USB {
    @Override
    public void connect() {
        System.out.println("鼠标连接成功...");
    }

    // 鼠标的特有方法点击
    public void click() {
        System.out.println("拼命的点击鼠标...");
    }
}
