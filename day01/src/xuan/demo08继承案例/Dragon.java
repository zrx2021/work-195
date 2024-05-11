package xuan.demo08继承案例;

public class Dragon extends Role {
    public void fly() {
        System.out.println("战力为：" + getAttackValue() + " 的" + getName() + "坦克在飞行");
    }
}
