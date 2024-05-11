package xuan.demo05饿汉式单例;

public class Demo1 {
    public static void main(String[] args) {
        // AudioPlayer ap1 = new AudioPlayer();
        // AudioPlayer ap2 = new AudioPlayer();
        // AudioPlayer ap3 = new AudioPlayer();

        // 使用单例，多次调用方法拿到的都是同一个对象（单例对象）
        AudioPlayer ap1 = AudioPlayer.getInstance();
        AudioPlayer ap2 = AudioPlayer.getInstance();
        System.out.println("ap1 = " + ap1);
        System.out.println("ap2 = " + ap2);
        System.out.println("ap1 == ap2：" + (ap1 == ap2));
    }
}
