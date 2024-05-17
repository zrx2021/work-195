package xuan.polymorphism.demo1;

public class Demo1 {
    public static void main(String[] args) {
        Animal animal = new Cat("波斯猫", 3, "公");
        animal.eat();

        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
