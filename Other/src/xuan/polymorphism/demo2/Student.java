package xuan.polymorphism.demo2;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 学生吃学生餐!");
    }

    public void study() {
        System.out.println(getName() + " 学生在摸鱼的学习!");
    }
}
