package xuan.extendhomework1;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public void catchMouse() {
        System.out.println(getColor() + "的" + getName() + "猫在抓老鼠");
    }
}
