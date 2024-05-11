package xuan.homework5;

public class Phone extends Digital {
    private String mode;

    public Phone(String mode) {
        this.mode = mode;
    }

    public Phone(String brand, double price, String mode) {
        super(brand, price);
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void call() {
        System.out.println("使用了价格是" + getPrice() + "的" + getMode() + "的" + getBrand() + "手机打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("打开了美颜进行拍照");
    }
}
