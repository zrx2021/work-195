package xuan.homework5;

public class Computer extends Digital {
    private String cpu;

    public Computer(String cpu) {
        this.cpu = cpu;
    }

    public Computer(String brand, double price, String cpu) {
        super(brand, price);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void coding() {
        System.out.println("使用了价格是" + getPrice() + "的" + getCpu() + "的" + getBrand() + "电脑进行编程");
    }
}
