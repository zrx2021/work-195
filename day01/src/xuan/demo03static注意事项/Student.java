package xuan.demo03static注意事项;

public class Student {
    static String schoolName;
    String name;

    public static void test01() {}
    public void test02() {}

    // 1、静态方法：可以直接访问静态成员，不可以直接访问非静态的成员 (静态来的早, 非静态来的晚)
    public static void show01() {
        System.out.println(schoolName);
        test01();

        // System.out.println(name);
        // test02();
        // 静态方法可以使用类名调用,此时可能还没有对象
        // System.out.println(this);
    }

    // 2、非静态方法中既可以直接访问静态成员，也可以直接访问非静态成员  (静态来的早, 非静态来的晚)
    public void show02() {
        System.out.println(schoolName);
        test01();

        System.out.println(name);
        test02();
        System.out.println(this); // this表示调用方法的那个对象
    }
}
