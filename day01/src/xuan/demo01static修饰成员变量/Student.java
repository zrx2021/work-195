package xuan.demo01static修饰成员变量;

public class Student {
    // 所有学生共享老师的姓名（只有一份，这个类的所有对象共享）
    static String teacherName;

    // 每个学生都有自己的姓名（普通成员变量，每个对象中都有一份）
    String name;
}
