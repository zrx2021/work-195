package xuan.extendhomework4;

public class BaoMaCar extends Car implements GPS {
    public BaoMaCar() {
    }

    public BaoMaCar(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void run() {
        System.out.println(getPrice() + "万元的" + getBrand() + "汽车正在公路上飞驰...");
    }

    @Override
    public void locate() {
        System.out.println(getPrice() + "万元的" + getBrand() + "汽车定位到了航投大厦...");
    }
}
