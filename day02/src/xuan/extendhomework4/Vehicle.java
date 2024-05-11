package xuan.extendhomework4;

public abstract class Vehicle {
    private String brand;
    private String name;

    public Vehicle() {
    }

    public Vehicle(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void run();
}
