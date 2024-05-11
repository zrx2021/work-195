package xuan.homework3;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("老老实实看家");
    }
}
