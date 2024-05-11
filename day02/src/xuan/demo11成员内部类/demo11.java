package xuan.demo11成员内部类;

/*
目标：了解成员内部类
    成员位置：类中方法外
    成员内部类：放在其他类中的类

    成员内部类的好处：可以直接使用用外部类的成员
 */
public class demo11 {
    public static void main(String[] args) {
        Body b = new Body();
        Body.Heart h = b.new Heart();
        h.jump();

        System.out.println("---------------");
        b.isLive = false;
        h.jump();

        System.out.println("---------------");
        // 使用方式二：缺点，没有保存外部类对象
        Body.Heart h2 = new Body().new Heart();
        h2.jump();
    }
}
