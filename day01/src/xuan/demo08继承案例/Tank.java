package xuan.demo08继承案例;

public class Tank extends Role {
    public void move() {
        System.out.println("战力为：" + getAttackValue() + " 的" + getName() + "坦克在移动");
    }
}
