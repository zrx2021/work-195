package xuan.homework3;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("年龄为：" + getAge() + "的" + getName() + "老师正在教课");
    }
}
