package xuan.demo07继承;

public class Person {
    String name;
    int age;
    private String password;

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

    public void run() {
        System.out.println(name + "正在跑步");
    }

    private void showPassWord() {
        System.out.println(name + "的密码是" + password);
    }
}
