package xuan.demo03static注意事项;

/*
    目标：了解static的注意事项
        1、静态方法：可以直接访问静态成员，不可以直接访问实例成员
        2、实例方法中既可以直接访问静态成员，也可以直接访问实例成员
        3、实例方法中可以出现this关键字，静态方法中不能出现this关键字
 */
public class Demo03 {
    // main方法是Java设计好的, 使用static修饰. JVM调用时Demo03.main(参数);
    public static void main(String[] args) {
        Student.test01();

        Student s1 = new Student();
        s1.show02();

        abc();
    }

    public static void abc() {
        System.out.println("abc");
    }
}
