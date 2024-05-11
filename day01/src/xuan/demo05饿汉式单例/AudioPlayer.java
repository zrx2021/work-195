package xuan.demo05饿汉式单例;

public class AudioPlayer {
    // 1.构造器私有，不让人创建对象
    private AudioPlayer() {

    }

    // 2.使用成员变量保存唯一对象，static修饰，在类加载的时候就创建好了这个对象
    // private int a = 10;
    private static AudioPlayer instance = new AudioPlayer();

    // 3.提供方法返回单例对象给别人使用
    public static AudioPlayer getInstance() {
        return instance;
    }

}
