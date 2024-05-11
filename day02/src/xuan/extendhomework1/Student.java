package xuan.extendhomework1;

public class Student extends Person {
    public Student() {
    }

    public Student(String number, String name, char gender, int age) {
        super(number, name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}
