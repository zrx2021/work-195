package xuan.extendhomework3;

public class Chef extends Employee {
    public Chef() {
    }

    public Chef(String name, String role, int age) {
        super(name, role, age);
    }

    public void cooking() {
        System.out.println(getAge() + "岁的厨师" + getName() + "正在炒菜");
    }
}
