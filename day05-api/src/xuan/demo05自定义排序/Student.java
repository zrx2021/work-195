package xuan.demo05自定义排序;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    @Override
    public int compareTo(Student o) {
        // this（左边）和o（右边）比较
        System.out.println(this + "和" + o);

        // 根据官方规则返回正负数和零
        // if (this.age > o.age) {
        //     return 1;// 左边比右边大返回正数
        // } else if (this.age < o.age) {
        //     return -1;// 左边比右边小返回负数
        // } else {
        //     return 0;// 相等时返回0
        // }
        return Integer.compare(this.age, o.age);
    }

    public Student() {
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
