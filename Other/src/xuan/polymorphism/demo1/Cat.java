package xuan.polymorphism.demo1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void catchMouse() {
        System.out.println(getName() + " 疯狂的抓老鼠!");
    }
}
