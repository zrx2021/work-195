package xuan.demo15按照JavaBean标准类.demo8继承案例;

public class Dragon extends Role {

    public Dragon() {

    }

    public Dragon(String name, int attackValue) {
        super(name, attackValue);
    }

    public void fly() {
        System.out.println("战力为：" + getAttackValue() + " 的" + getName() + "坦克在飞行");
    }
}
