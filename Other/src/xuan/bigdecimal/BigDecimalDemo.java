package xuan.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        BigDecimal sum = BigDecimal.valueOf(0.0);

        for (int i = 0; i < arr.length; i++) {
            sum = sum.add(BigDecimal.valueOf(arr[i]));
        }

        System.out.println("总和是：" + sum.doubleValue());
        System.out.println("平均值是：" + sum.divide(BigDecimal.valueOf(arr.length), 4, RoundingMode.HALF_UP));
    }
}
