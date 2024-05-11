package xuan.demo01static修饰成员变量;

public class Demo02 {
    public static void main(String[] args) {
        // 创建User对象
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        // 打印在线人数
        System.out.println("在线人数：" + User.number);
        System.out.println("在线人数：" + u1.number);
    }
}
