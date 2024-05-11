package xuan.extendhomework3;

public class Employee {
    private String name;
    private String role;
    private int age;

    public Employee() {
    }

    public Employee(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println(age + "岁的" + name + "正在说话");
    }
}
