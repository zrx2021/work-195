package xuan.extendhomework1;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public void lookHome() {
        System.out.println(getColor() + "的" + getName() + "狗在看家");
    }
}
