package xuan.extendhomework3;

public class Waiter extends Employee {
    public Waiter() {
    }

    public Waiter(String name, String role, int age) {
        super(name, role, age);
    }

    public void serving() {
        System.out.println(getAge() + "岁的服务员" + getName() + "正在上菜");
    }
}
