package xuan.homework1;

public class Test1 {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            public void work() {
                System.out.println("工作");
            }

            @Override
            public void meet() {
                System.out.println("开会");
            }
        };

        employee.work();
        employee.meet();
    }
}
