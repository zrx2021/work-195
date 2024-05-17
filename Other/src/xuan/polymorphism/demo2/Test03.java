package xuan.polymorphism.demo2;

public class Test03 {
    public static void main(String[] args) {
        // 9.在main方法中创建普通的老师t1,姓名为马云,年龄为45岁
        Teacher t1 = new Teacher("马云", 45);
        // 10.在main方法中创建会打篮球的老师t2,姓名为大姚,年龄为35岁
        SportTeacher t2 = new SportTeacher("大姚", 35);

        // 11.在main方法中创建普通的学生s1,姓名为小王,年龄为20
        Student s1 = new Student("小王", 20);
        // 12.在main方法中创建会打篮球的学生s2,姓名为王中王,年龄为21
        SportStudent s2 = new SportStudent("王中王", 21);

        // 13.在main方法中调用goToSport方法.传入t1,t2,s1,s2四个对象.我们会发现只有实现Sport接口的对象才能传入
        // goToSport(t1);
        goToSport(t2);
        // goToSport(s1);
        goToSport(s2);
    }

    // 8.在测试类中定义静态的goToSport方法,参数为Sport接口类型
    public static void goToSport(Sport s) {
        s.playBasketball();
    }
}