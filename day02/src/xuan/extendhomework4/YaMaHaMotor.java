package xuan.extendhomework4;

public class YaMaHaMotor extends Motor {
    public YaMaHaMotor() {
    }

    public YaMaHaMotor(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void run() {
        System.out.println(getPrice() + "万元的" + getBrand() + "摩托车正在公路上兜风...");
    }
}
