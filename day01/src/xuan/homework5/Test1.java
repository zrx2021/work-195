package xuan.homework5;

public class Test1 {
    public static void main(String[] args) {
        Phone phone = new Phone("水果", 4999, "5G");
        phone.call();
        phone.takePhoto();
        System.out.println("-----------------------------------------");
        Computer computer = new Computer("拯救者", 7999, "8核");
        computer.coding();
        computer.takePhoto();
        System.out.println("-----------------------------------------");
        Camera camera = new Camera("佳能", 6000, "数码");
        camera.video();
        camera.takePhoto();
    }
}
