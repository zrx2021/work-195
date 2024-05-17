package xuan.bigdecimal;

public class Student {
    private String name;
    private char gender;
    private int age;
    private double score;

    public Student() {
    }

    public Student(String name, char gender, int age, double score) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
