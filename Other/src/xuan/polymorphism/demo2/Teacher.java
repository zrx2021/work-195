package xuan.polymorphism.demo2;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " 老师吃工作餐!");
    }

    public void teach() {
        System.out.println(getName() + "老师在激情的讲课!");
    }
}
