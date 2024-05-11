package xuan.demo02多态;

public class Student extends Person{
    String name = "学生李四";

    @Override
    public void run() {
        System.out.println("学生在快速的跑步");
    }

    public void study() {
        System.out.println("学生努力学习");
    }
}
