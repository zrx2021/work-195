package demo06注解解析案例;

// 只有添加了@Save的成员变量才能保存文件, isNameValue = true保存属性名和属性值,isNameValue = false只保存属性名
public class Student2 {
    @Save(isNameValue = true)
    private String name;
    @Save()
    private int age;
    @Save
    private char sex;
    @Save(isNameValue = true)
    private double height;
    private String hobby;

    public Student2() {
    }

    public Student2(String name, int age, char sex, double height, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.hobby = hobby;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
