package extendhomework17;

import java.io.Serializable;

public class Student implements Serializable {
    private String number;
    private String name;
    private transient String identity;
    private double javaScore;
    private double mathScore;
    private double englishScore;

    public Student() {
    }

    public Student(String number, String name, String identity, double javaScore, double mathScore, double englishScore) {
        this.number = number;
        this.name = name;
        this.identity = identity;
        this.javaScore = javaScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
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

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }
}
