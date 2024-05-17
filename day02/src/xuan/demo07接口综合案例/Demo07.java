package xuan.demo07接口综合案例;

/*
    定义USB接口,包含connect()抽象方法
    定义Keyboard键盘类实现USB接口
    定义Mouse鼠标类实现USB接口
    定义测试类,创建Keyboard和Mouse对象
    在测试类定义useUsb()方法, 可以传入Keyboard和Mouse对象
 */
public class Demo07 {
    public static void main(String[] args) {
        // 定义测试类,创建Keyboard和Mouse对象
        Keyboard k = new Keyboard();
        Mouse m = new Mouse();

        useUsb(k);
        useUsb(m);
    }

    // 在测试类定义useUsb()方法, 可以传入Keyboard和Mouse对象
    // 接口的好处: (面向接口编程)接口结合多态一起使用, 方法参数写接口, 传入接口的任意实现类, 扩展性强
    public static void useUsb(USB usb) {
        usb.connect();

        // 如果usb是Keyboard调用Keyboard的特有功能
        if (usb instanceof Keyboard) {
            // 把use 由 USB类型 强制转成 Keyboard类型
            Keyboard k = (Keyboard) usb;
            // 调用键盘特有方法敲击
            k.type();
        }

        // 如果usb是Mouse调用Mouse的特有功能
        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }
    }

    /* public static void useUsb(Keyboard k) {
        k.connect();
    }

    public static void useUsb(Mouse m) {
        m.connect();
    } */
}
