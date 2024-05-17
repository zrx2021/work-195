package xuan.homework1;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        double[] arr = {2.2, 5.5, 6.6, 2.2, 8.8, 1.1, 2.2, 8.8, 5.5, 2.2, 6.6};
        Set<Double> hashSet = new HashSet<>();

        for (double v : arr) {
            hashSet.add(v);
        }

        System.out.println(hashSet);
    }
}
