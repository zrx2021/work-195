package xuan.demo11成员内部类;

// 人的身体
public class Body {// 外部类
    public boolean isLive = true;// 是否活着
    private final int weight = 30;

    public void walk() {
        System.out.println("没病走两步");
    }

    // 成员位置：类中方法外
    class Heart { // 成员内部类
        private final int weight = 20;

        public void jump() {
            int weight = 10;
            System.out.println("心脏跳动");
            // 内部类的好处：可以直接使用外部类成员
            System.out.println(isLive);
            walk();
            System.out.println("第14行的weight：" + weight);// 第14行的weight：10
            System.out.println("第13行的weight：" + this.weight);// 第13行的weight：20
            System.out.println("第6行的weight：" + Body.this.weight);// 第6行的weight：30
        }
    }
}
