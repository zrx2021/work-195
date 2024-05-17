package xuan.abstractclass.demo1;

public class Demo1 {
    public static void main(String[] args) {
        Coach coach = new Coach("c001", "张教练", '男', 50);
        coach.eat();

        System.out.println("---------------");

        Athletes athletes = new Athletes("a002", "全红婵", '女', 17, "跳水一班");
        athletes.eat();
    }
}
