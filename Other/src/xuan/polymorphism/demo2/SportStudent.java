package xuan.polymorphism.demo2;

public class SportStudent extends Student implements Sport {
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println(getName() + " 学生暴力灌篮!");
    }
}
