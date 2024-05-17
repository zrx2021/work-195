package xuan.extendhomework3;

public class Person {
    private String name;
    private char gender;
    private int age;
    private String qqNumber;

    public Person() {
    }

    public Person(String name, char gender, int age, String qqNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.qqNumber = qqNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQQNumber() {
        return qqNumber;
    }

    public void setQQNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", qqNumber='" + qqNumber + '\'' +
                '}';
    }
}
