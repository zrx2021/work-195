package xuan.homework4;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    public void watch() {
        System.out.println(getName() + "正在看家");
    }
}
