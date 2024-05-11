package xuan.extendhomework2;

public class Test1 {
    public static void main(String[] args) {
        Employee employee = new Employee("9527", "华安", 28);
        employee.sendNotice();

        Manager manager = new Manager("2795", "秋香", 18, 2500000);
        manager.sendNotice();
    }
}
