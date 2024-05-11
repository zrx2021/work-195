package xuan.extendhomework1;

public class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String number, String name, char gender, int age) {
        super(number, name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("吃员工餐");
    }
}
