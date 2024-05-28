package demo06注解解析案例;

// 2.定义普通类并包含多个方法, 在一些方法头上配@MyTest注解
public class Student {
    public void getUp() {
        System.out.println("学生起床啦！");
    }

    @MyTest(count = 5)
    public void eat() {
        System.out.println("学生吃饭啦！");
    }

    public void study() {
        System.out.println("学生学习啦！");
    }

    @MyTest(count = 10)
    public void sleep() {
        System.out.println("学生睡觉啦！");
    }
}
