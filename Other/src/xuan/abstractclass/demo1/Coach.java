package xuan.abstractclass.demo1;

public class Coach extends Person {
    public Coach() {
    }

    public Coach(String id, String name, char gender, int age) {
        super(id, name, gender, age);
    }

    @Override
    public void eat() {
        System.out.println("教练吃工作餐");
    }
}
