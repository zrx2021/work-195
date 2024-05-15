package com.itheima.test02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
有以下double数组：
    double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
请编程计算它们的总值及平均值(四舍五入保留小数点后2位)
 */
public class Demo02 {
    public static void main(String[] args) {
        // 1.定义数组
        double[] arr = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};

        // 2.定义变量保存总和
        // double sum = 0;
        BigDecimal sum = BigDecimal.valueOf(0);

        // 3.遍历数组, 获取每个元素
        for (int i = 0; i < arr.length; i++) {
            double number = arr[i];
            // 4.把double类型的元素转换为BigDecimal
            // 5.进行求和
            // sum = sum + number;
            sum = sum.add(BigDecimal.valueOf(number));
        }

        // 6.求平均值 = 总和 / 数量 (四舍五入保留小数点后2位)
        BigDecimal avg = sum.divide(BigDecimal.valueOf(arr.length), 2, RoundingMode.HALF_UP);
        System.out.println("平均值: " + avg);
    }
}
