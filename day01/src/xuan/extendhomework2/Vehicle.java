package xuan.extendhomework2;

public class Vehicle {
    private int wheel;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println(wheel + "个轮子" + color + "的车在跑");

    }
}
