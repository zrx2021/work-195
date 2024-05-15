package xuan.demo02多态;

public class Demo024 {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.name);
    }
}
class Animal{
    String name = "动物";
}
class Dog extends Animal{
    String name = "狗";
}