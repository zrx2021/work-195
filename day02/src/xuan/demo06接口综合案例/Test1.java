package xuan.demo06接口综合案例;

/*
    定义USB接口,包含connect()抽象方法
    定义Keyboard键盘类实现USB接口
    定义Mouse鼠标类实现USB接口
    定义测试类,创建Keyboard和Mouse对象
    在测试类定义useUsb()方法, 可以传入Keyboard和Mouse对象
 */
public class Test1 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();

        useUSB(keyboard);
        useUSB(mouse);
    }

    // 在测试类定义usbUSB()方法，可以传传入Keyboard和Mouse对象
    // 接口的好处：（面向接口编程）接口结合多态一起使用，方法参数写接口，传入接口的任意实现类，扩展性强
    private static void useUSB(USB usb) {
        usb.connect();

        // 如果usb是Keyboard则调用Keyboard的特有功能
        if (usb instanceof Keyboard) {
            // 把usb由USB类型 强制转成 Keyboard 类型
            Keyboard k = (Keyboard) usb;
            // 调用键盘特有方法敲击
            k.type();
        }

        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }
    }
}
