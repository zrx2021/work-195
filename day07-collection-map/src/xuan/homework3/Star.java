package xuan.homework3;

import java.util.Objects;

public class Star {
    private String name;
    private int age;

    public Star() {
    }

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Star star = (Star) o;

        if (age != star.age) return false;
        return Objects.equals(name, star.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
