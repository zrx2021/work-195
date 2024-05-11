package xuan.demo14子类构造器的特点;

/*
人类：姓名，年龄
学生：姓名，年龄，成绩

子类所有构造器，都会先执行父类的无参构造器，再执行自己的构造器代码
    为什么要这样设计呢？
        因为父类中可能有成员变量，要通过父类的构造器给父类的成员变量赋值
    为什么走父类无参构造器？
        无参构造器格式是固定的，满参构造器不确定，Java选择默认走父类的无参构造器
    子类构造器是如何调用到父类的无参构造器的？
        在子类构造器的第一行，默认会添加super();
继承构造器的标准做法：
    1.子类无参调用父类无参
    2.子类满参调用父类满参
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
            使用无参构造器创建Student对象
                父类无参构造器 Employee()
                子类无参构造器 Student()
         */
        Student s1 = new Student();

        System.out.println("-----------");

        /*
            使用满参构造器创建Student对象
                父类无参构造器 Employee()
                子类满参构造器 Student(String name, int age, double score)
         */
        Student s2 = new Student("小王", 18, 99);
        System.out.println(s2.getName() + "：" + s2.getAge() + "：" + s2.getScore());
    }
}
