package xuan.demo06懒汉式单例;

public class VideoPlayer {
    // 2.使用静态成员变量保存唯一的单例对象（此时还没有创建对象）
    private static VideoPlayer instance;

    // 1.构造器私有，不让别的地方创建对象
    private VideoPlayer() {

    }

    // 3.提供方法返回单例对象
    public static VideoPlayer getInstance() {
        // 使用时，如果没有对象，创建单例对象
        if (instance == null) {
            instance = new VideoPlayer();
        }
        // 返回单例对象
        return instance;
    }
}
