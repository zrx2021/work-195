package xuan.homework4;

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog("金毛", "黄色", 999);

        dog.eat();
        dog.watch();
        System.out.println("----------------");

        Cat cat = new Cat("橘猫", "orange", 999);
        cat.eat();
        cat.catchMouse();
    }
}
