package xuan.extendhomework1;

public abstract class Person {
    private String number;
    private String name;
    private char gender;
    private int age;

    public Person() {
    }

    public Person(String number, String name, char gender, int age) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public abstract void eat();
}
