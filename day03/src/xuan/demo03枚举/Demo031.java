package xuan.demo03枚举;

public class Demo031 {
    public static void main(String[] args) {
        Person p1 = new Person("刘亦菲", Gender.FEMALE);

        Person p2 = new Person("刘德华", Gender.MALE);

        // 能自动转成int的都可以，String、枚举
        // 使用switch匹配枚举
        switch (p1.getSex()) {
            case MALE:
                System.out.println("男");
                break;
            case FEMALE:
                System.out.println("女");
                break;
        }

        // 拓展：把数字转成枚举
        Gender g0 = Gender.values()[0];
        Gender g1 = Gender.values()[1];
        System.out.println("g0 = " + g0);
        System.out.println("g1 = " + g1);
    }
}
