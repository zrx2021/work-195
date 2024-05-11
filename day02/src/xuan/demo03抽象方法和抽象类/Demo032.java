package xuan.demo03抽象方法和抽象类;

public class Demo032 {
    public static void main(String[] args) {
        // 不能创建Animal对象
        // Animal animal = new Animal();

        Chicken k = new Chicken();

        Dog dog = new Dog();

        test(k);
        test(dog);
    }

    public static void test(Animal animal) {
        animal.run();
    }
}
