package xuan.selflearn4;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("老师吃工作餐");
    }

    public void teach() {
        System.out.println("老师在教课");
    }
}
