package xuan.demo12静态内部类;

// 人的身体
public class Body { // 外部类
    public static boolean isLive = true; // 是否活着
    public static void walk() {
        System.out.println("没病走两步!");
    }

    // 成员位置: 类中方法外
    static class Heart { // 静态成员内部类 (静态只能使用外部类静态的成员)
        public void jump() {
            System.out.println("心脏跳动!");
            // 内部类的好处: 可以直接使用外部类的成员
            System.out.println(isLive);
            walk();
        }
    }
}
