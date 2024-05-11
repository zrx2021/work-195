package xuan.extendhomework2;

public class Test1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setWheel(4);
        car.setColor("白色");
        car.run();

        ElectricBicycle bicycle = new ElectricBicycle();
        bicycle.setWheel(2);
        bicycle.setColor("黑色");
        bicycle.run();
        bicycle.charge();
    }
}
