package xuan.homework2;

public class Demo1 {
    public static void main(String[] args) {
        test01(System.out::println);
    }

    public static void test01(Phone phone) {
        phone.sendMessage("给张三发送了一条信息");
    }
}
