package xuan.abstractclass.demo2;

public class Student extends Person implements ISinger {
    public void eat() {
        System.out.println("吃学生餐");
    }

    public void sing() {
        System.out.println("歌唱祖国...");
    }
}