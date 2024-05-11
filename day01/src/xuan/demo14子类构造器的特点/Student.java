package xuan.demo14子类构造器的特点;

/*
在子类中 -> 右键 -> generate -> Constructor
 */
public class Student extends Person {
    private double score;

    public Student() {
        super();// 必须在第一行，不写默认添加
        System.out.println("子类无参构造器，public Student()");
    }

    // 子类满参调用父类满参
    public Student(String name, int age, double score) {
        super(name, age);// 标准子类满参调用父类满参
        this.score = score;
        System.out.println("子类满参构造器，Student(String name, int age, double score)");
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
