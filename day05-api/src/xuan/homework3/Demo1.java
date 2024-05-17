package xuan.homework3;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("张三", 23, 1000.0);
        employees[1] = new Employee("王五", 25, 3000.0);
        employees[2] = new Employee("李四", 24, 4000.0);
        employees[3] = new Employee("赵六", 26, 6000.0);

        Arrays.sort(employees, (o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));

        System.out.println(Arrays.toString(employees));
    }
}
