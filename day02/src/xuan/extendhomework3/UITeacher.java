package xuan.extendhomework3;

public class UITeacher extends Employee implements Draw {

    public UITeacher() {
    }

    public UITeacher(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void work() {
        System.out.println(getAge() + "岁的" + getGender() + "老师" + getName() + "正在讲页面表格实现...");
    }

    @Override
    public void draw() {
        System.out.println(getAge() + "岁的" + getGender() + "老师" + getName() + "正在绘画...");
    }
}
