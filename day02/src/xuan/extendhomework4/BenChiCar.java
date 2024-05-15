package xuan.extendhomework4;

public class BenChiCar extends Car {
    public BenChiCar() {
    }

    public BenChiCar(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void run() {
        System.out.println(getPrice() + "万元的" + getBrand() + "汽车正在公路上飞驰...");
    }
}
