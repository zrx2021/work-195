package xuan.abstractclass.demo1;

public class Athletes extends Person {
    private String classes;

    public Athletes(String classes) {
        this.classes = classes;
    }

    public Athletes(String id, String name, char gender, int age, String classes) {
        super(id, name, gender, age);
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public void eat() {
        System.out.println("运动员吃营养餐");
    }
}
