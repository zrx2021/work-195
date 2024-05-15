package xuan.extendhomework4;

public abstract class Vehicle {
    private String brand;
    private double price;

    public Vehicle() {
    }

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void run();
}
