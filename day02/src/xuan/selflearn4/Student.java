package xuan.selflearn4;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃学生餐");
    }

    public void study() {
        System.out.println("学生在学习");
    }
}
