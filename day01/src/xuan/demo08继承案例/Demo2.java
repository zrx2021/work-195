package xuan.demo08继承案例;

public class Demo2 {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.setName("大龙");
        dragon.setAttackValue(999);
        dragon.attack();
        dragon.fly();

        System.out.println("--------------------");

        Tank tank = new Tank();
        tank.setName("大坦克");
        tank.setAttackValue(123);
        tank.attack();
        tank.move();
    }
}
