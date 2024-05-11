package xuan.demo15按照JavaBean标准类.demo8继承案例;

public class Tank extends Role {
    public Tank() {
    }

    public Tank(String name, int attackValue) {
        super(name, attackValue);
    }

    public void move() {
        System.out.println("战力为：" + getAttackValue() + " 的" + getName() + "坦克在移动");
    }
}
