package xuan.demo06接口介绍;

public class Student implements ChinesePerson, Dance {

    @Override
    public void eat() {
        System.out.println("学生使用筷子吃火锅！");
    }

    @Override
    public void dance() {
        System.out.println("学生跳芭蕾舞！");
    }
}
