package xuan.extendhomework4;

public class BaoMaMotor extends Motor implements GPS {
    public BaoMaMotor() {
    }

    public BaoMaMotor(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void run() {
        System.out.println(getPrice() + "万元的" + getBrand() + "摩托车正在公路上飞驰...");
    }

    @Override
    public void locate() {
        System.out.println(getPrice() + "万元的" + getBrand() + "摩托车定位在了航投大厦...");
    }
}
