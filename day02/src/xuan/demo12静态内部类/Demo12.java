package xuan.demo12静态内部类;

/*
目标: 了解成员内部类
    静态成员内部类 (静态只能使用外部类静态的成员)
 */
public class Demo12 {
    public static void main(String[] args) {
        // 使用内部类使用: 直接创建内部类对象
        Body.Heart h = new Body.Heart();
        h.jump();

        Body.isLive = false;
        h.jump();
    }
}
