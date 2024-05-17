package xuan.polymorphism.demo2;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println(getName() + " 老师, 穿背带裤打篮球!");
    }
}
