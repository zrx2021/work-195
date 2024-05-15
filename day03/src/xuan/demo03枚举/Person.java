package xuan.demo03枚举;

public class Person {
    private String name;
    private Gender sex;

    public Person(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}
