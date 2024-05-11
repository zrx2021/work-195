package xuan.homework4;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public void catchMouse() {
        System.out.println(getName() + "正在捉老鼠");
    }
}
