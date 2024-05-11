package xuan.demo13局部内部类;

/*
目标: 了解局部内部类
    局部位置: 方法中、{}中
    局部内部类: 放在方法中的类

    局部内部类的好处: 可以使用外部类的成员
 */
public class Demo13 {
    private static int x = 1;
    public static void abc() {
        System.out.println("abc");
    }

    public static void test() {
        // 局部内部类: 放在方法中的类
        class Inner {
            private int weight = 10;
            public void show() {
                System.out.println("show");
                // 局部内部类的好处: 可以使用外部类的成员
                System.out.println("x = " + x);
                abc();
            }
        }
        // 局部内部类只能在本方法使用
        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        test();
        // Inner i = new Inner();

        System.out.println("----------------");
    }

    public void test01(int a) {
        System.out.println(a);
    }
}
