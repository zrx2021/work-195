package xuan.abstractclass.demo2;

public class Demo02 {
    public static void main(String[] args) {
        Student st = new Student();
        // Person s = (ISinger)st;
        Person p = new Student();
        ISinger s = new Student();
        ISinger iSinger = (ISinger) st;
    }
}
