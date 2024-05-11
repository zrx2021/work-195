package xuan.homework2;

public class Demo1 {
    public static void main(String[] args) {
        Manager manager = new Manager("v001", "张三", 13000);
        Cook cook = new Cook("p001", "小李", 7000);

        manager.work();
        manager.eat();
        System.out.println("------------------------");
        cook.eat();
        cook.work();
    }
}
