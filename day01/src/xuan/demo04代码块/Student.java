package xuan.demo04代码块;

public class Student {
    static String teacherName;
    String name;

    // 静态代码块
    static {
        System.out.println("我是静态代码块");
        teacherName = "平哥";
    }

    // 实例代码块
    {
        System.out.println("我是实例代码块");
        name = "张三";
    }

    // 构造器
    public Student() {
        System.out.println("我是无参构造");
    }
}
