package xuan.demo08接口新增的3种方法;

/*
在不改变接口实现类的情况下扩展接口的能力, JDK8开始在接口中新增了三种方法,这三种方法特点,带有方法体
 */
public interface USB {
    public abstract void connect();

    // 默认方法(JDK8)
    public default void exit() {
        System.out.println("usb退出了...");
        testPrivate();
        testPrivate();
    }

    // 静态方法(JDK8)
    public static void test() {
        System.out.println("我是接口静态方法 test()");
    }

    // 私有方法(JDK9) 给本接口的其他方法使用
    private void testPrivate() {
        System.out.println("我是接口私有方法 testPrivate()");
    }
}
