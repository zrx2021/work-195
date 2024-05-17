package xuan.demo05自定义排序;

public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(this.age, o.age);
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
    }
}
