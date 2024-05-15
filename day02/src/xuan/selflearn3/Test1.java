package xuan.selflearn3;

public class Test1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.eat();
        a2.eat();

        if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.lookHome();
        }

        if (a2 instanceof Cat) {
            Cat cat = (Cat) a2;
            cat.catchMouse();
        }
    }
}
