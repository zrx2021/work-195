package xuan.demo08泛型方法;

/*
目标: 体验泛型方法

泛型方法的好处: 调用方法时可以传入任意类型
 */
public class Demo08 {
    public static void main(String[] args) {
        show(11);
        show(2.2);
        show(true);
        show("你好呀");
        show('好');
    }

    // 泛型方法
    public static <T> void show(T t) {
        System.out.println("t = " + t);
    }
}
