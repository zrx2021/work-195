package xuan.homework2;

public class Test1 {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("打电话");
            }

            @Override
            public void sendMessage() {
                System.out.println("发短信");
            }
        };

        phone.call();
        phone.sendMessage();
    }
}
