package xuan.extendhomework3;

public class Test1 {
    public static void main(String[] args) {
        Waiter w = new Waiter();
        w.setName("景甜");
        w.setAge(18);
        w.speak();
        w.serving();

        Chef chef = new Chef();
        chef.setName("秦俊杰");
        chef.setAge(30);
        chef.speak();
        chef.cooking();
    }
}
