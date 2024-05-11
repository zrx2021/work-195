package xuan.demo15按照JavaBean标准类.demo8继承案例;

public class Demo2 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.setName("大龙");
        dragon.setAttackValue(999);
        dragon.attack();
        dragon.fly();

        System.out.println("--------------------");

        Tank tank = new Tank("大坦克", 123);
        tank.attack();
        tank.move();
    }
}
