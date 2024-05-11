package xuan.demo06懒汉式单例;

public class Demo1 {
    public static void main(String[] args) {
        VideoPlayer v1 = VideoPlayer.getInstance();
        VideoPlayer v2 = VideoPlayer.getInstance();
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v1 == v2：" + (v1 == v2));
    }
}
