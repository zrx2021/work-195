package xuan.demo02多态;

public class Teacher extends Person {
    String name = "学生王五";

    @Override
    public void run() {
        System.out.println("老师在散步");
    }
}
