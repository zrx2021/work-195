package xuan.homework2;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("工号为：" + getId() + "，姓名为：" + getName() + "，工资为：" + getSalary() + "的厨师在吃肉");
    }

    @Override
    public void eat() {
        System.out.println("工号为：" + getId() + "，姓名为：" + getName() + "，工资为：" + getSalary() + "的厨师在炒菜");
    }
}
