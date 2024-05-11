package xuan.extendhomework2;

public class Manager extends Person{
    double money;

    public Manager(double money) {
        this.money = money;
    }

    public Manager(String id, String name, int age, double money) {
        super(id, name, age);
        this.money = money;
    }

    @Override
    public void content() {
        System.out.println("我是编号为:" + getId() + "奖金为:" + money + "的" + getAge() + "岁的经理" + getName() + ",我发通知了...");
    }
}
