package xuan.homework3;

public class Demo1 {
    public static void main(String[] args) {
        Animal a1 = new Dog("狗", 100);
        Animal a2 = new Cat("猫", 100);

        a1.eat();
        if (a1 instanceof Dog) {
            Dog dog = (Dog) a1;
            dog.lookHome();
        }

        System.out.println("--------------------");

        a2.eat();
        if (a2 instanceof Cat) {
            Cat cat = (Cat) a2;
            cat.catchMouse();
        }
    }
}
