package xuan.homework3;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("努力抓老鼠");
    }
}
