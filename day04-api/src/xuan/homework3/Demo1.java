package xuan.homework3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        double[] arr2 = {-0.1, -0.2, -2.1, -3.2, -5.56, -7.21};
        BigDecimal sum = BigDecimal.valueOf(0.0);
        BigDecimal sum2 = BigDecimal.valueOf(0.0);
        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(BigDecimal.valueOf(arr[i]));
            sum2 = sum2.add(BigDecimal.valueOf(arr2[i]));
        }
        // 四舍五入，看源码中的例子
        double average = sum.divide(BigDecimal.valueOf(arr.length), 10, RoundingMode.HALF_UP).doubleValue();
        double average2 = sum2.divide(BigDecimal.valueOf(arr2.length), 10, RoundingMode.HALF_UP).doubleValue();
        System.out.println("总值是：" + sum + "平均值是：" + average);
        System.out.println("总值是：" + sum2 + "平均值是：" + average2);
    }
}
