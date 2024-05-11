package xuan.extendhomework2;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(int wheel, String color) {
        super(wheel, color);
    }

    public void addGas() {
        System.out.println(getWheel() + "个轮子的" + getColor() + "小汽车在加油");
    }
}
