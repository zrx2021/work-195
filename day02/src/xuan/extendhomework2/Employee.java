package xuan.extendhomework2;

public class Employee extends Person{
    public Employee() {
    }

    public Employee(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void content() {
        System.out.println("我是编号为:" + getId() + "的" + getAge() + "岁的员工" + getName() + ",我发通知了...");
    }
}
