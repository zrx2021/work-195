package xuan.demo01static修饰成员变量;

// 用户类
public class User {
    // 保存在线人数，是所有User对象共享，使用static修饰
    static int number;

    // 每次创建对象都会执行构造器，在构造器中进行在线人数+1
    public User() {
        // static修饰成员变量推荐使用类名.静态成员变量名
        // User.number++;

        // 注意：当前类中可以省略 类名.
        number++;
    }
}
