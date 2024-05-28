package demo01反射;

public class Employee {
    private String name;
    private int age;

    public double weight;
    public double height;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    protected Employee(int age) {
        this.age = age;
    }

    private Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int sleep(int hours) {
        System.out.println("sleep: " + hours);
        return hours * 2;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}