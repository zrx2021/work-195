package xuan.extendhomework5;

public class Demo1 {
    public static void main(String[] args) {
        add();
        add(1);
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
        add(1, 2, 3, 4, 5);
    }

    public static int add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
