package xuan.demo08继承案例;

public class Role {
    private String name;
    private int attackValue;

    public Role() {
    }

    public Role(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void attack() {
        System.out.println("战力为：" + attackValue + " 的" + name + "在攻击");
    }
}
