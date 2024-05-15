package xuan.demo02练习;

/*
    创建一个运动接口Sport，定义一个跑步的方法 running();
    定义Student类实现Sport接口，重写running方法，方法中输出，学生慢慢的跑步

    在测试类中定义goRunning(Sport s)方法,方法内部调用s对象的running()方法
    在测试类main中创建Sutdent对象, 调用goRunning()方法,并传入Student对象
    在测试类main中调用goRunning()方法,并传入匿名内部类对象, 重写running法，方法中输出，匿名飞快的跑步
*/
public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        goRunning(s1);

        goRunning(new Sport() {
            @Override
            public void running() {
                System.out.println("匿名飞快地跑步");
            }
        });
    }

    public static void goRunning(Sport sport) {
        sport.running();
    }
}
