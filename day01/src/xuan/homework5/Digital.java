package xuan.homework5;

public class Digital {
    private String brand;
    private double price;

    public Digital() {
    }

    public Digital(String brand, double price) {
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

    public void takePhoto() {
        System.out.println("简单拍照");
    }
}
