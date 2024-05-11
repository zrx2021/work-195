package xuan.extendhomework2;

public class ElectricBicycle extends Vehicle {
    public ElectricBicycle() {
    }

    public ElectricBicycle(int wheel, String color) {
        super(wheel, color);
    }

    public void charge() {
        System.out.println(getWheel() + "个轮子的" + getColor() + "电动自行车在充电");
    }
}
