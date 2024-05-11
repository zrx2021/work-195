package xuan.extendhomework3;

public class JavaTeacher extends Employee {
    public JavaTeacher() {
    }

    public JavaTeacher(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void work() {
        System.out.println(getAge() + "岁的" + getGender() + "老师" + getName() + "正在讲java接口和抽象类...");
    }
}
