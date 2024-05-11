package xuan.demotest1;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }
    void eat(){
        System.out.println("学生在吃饭");
    }
    public void eat2(){
        System.out.println("学生在吃饭");
    } 
}