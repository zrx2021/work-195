package xuan.homework3;

public class Car {
    private String brand;

    public void run(Direction o) {
        switch (o) {
            case EAST:
                System.out.println(brand + " 汽车向东行驶");
                break;
            case SOUTH:
                System.out.println(brand + " 汽车向南行驶");
                break;
            case WEST:
                System.out.println(brand + " 汽车向西行驶");
                break;
            case NORTH:
                System.out.println(brand + " 汽车向北行驶");
                break;
        }
    }

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
