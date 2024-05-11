package xuan.demo14子类构造器的特点;

public class Person {
    private String name;
    private int age;

    // 父类无参构造器必须要有（JavaBean的要求之一）
    // 因为子类继承父类时，默认会调用无参构造器
    public Person() {
        System.out.println("父类无参构造器，public Employee()");
    }

    // 建议有满参构造器
    public Person(String name, int age) {
        System.out.println("父满参构造器，Employee(String name, int age)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
