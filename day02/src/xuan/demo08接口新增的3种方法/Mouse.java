package xuan.demo08接口新增的3种方法;

public class Mouse implements USB{
    @Override
    public void connect() {
        System.out.println("连接上了鼠标...");
    }
}
