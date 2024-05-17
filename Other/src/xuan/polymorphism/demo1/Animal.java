package xuan.polymorphism.demo1;

public class Animal {
    private String name;
    private int age;
    private String sex;

    public Animal() {
    }

    public Animal(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void eat() {
        System.out.println(name + "在吃饭!");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + ", sex = " + sex + "}";
    }
}
