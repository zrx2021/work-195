package xuan.homework3;

public class Coder extends Person{
    public Coder() {
    }

    public Coder(String name, int age) {
        super(name, age);
    }

    public void coding() {
        System.out.println("年龄：" + getAge() + "的" + getName() + "程序员正在打代码");
    }
}
