package xuan.demo05BigDecimal类;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo042 {
    public static void main(String[] args) {
        // 创建BigDecimal对象
        // 1.BigDecimal(double val): 将 double转换为 BigDecimal (不推荐使用)
        BigDecimal bd1 = new BigDecimal(0.4);// 0.40000000000000002220446049250313080847263336181640625
        System.out.println("bd = " + bd1);

        // 2.BigDecimal(String val): 将 String转换为 BigDecimal (推荐)
        BigDecimal bd2 = new BigDecimal("0.4");
        System.out.println("bd2 = " + bd2);// 0.4

        BigDecimal bd3 = BigDecimal.valueOf(0.4);// 强烈推荐
        System.out.println("bd3 = " + bd3);

        BigDecimal bd4 = BigDecimal.valueOf(0.2);

        // 3.BigDecimal add(BigDecimal augend): 相加
        BigDecimal add = bd3.add(bd4);
        System.out.println("add = " + add);

        // 4.BigDecimal subtract(BigDecimal subtrahend): 相减
        BigDecimal sub = bd3.subtract(bd4);
        System.out.println("sub = " + sub);

        // 5.BigDecimal multiply(BigDecimal multiplicand): 相乘
        BigDecimal multiply = bd3.multiply(bd4);
        System.out.println("multiply = " + multiply);

        // 6.BigDecimal divide(BigDecimal divisor): 相除
        BigDecimal divide = bd3.divide(bd4);
        System.out.println("divide = " + divide);

        // 特殊情况 (除不尽)
        // BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode): 指定保留小数的位数
        // int scale: 保留的小数位数
        // RoundingMode roundingMode: 舍弃模式 HALF_UP四舍五入
        BigDecimal b5 = BigDecimal.valueOf(20);
        BigDecimal b6 = BigDecimal.valueOf(3);
        // 保留两位小数，并四舍五入
        BigDecimal divide2 = b5.divide(b6, 2, RoundingMode.HALF_UP);
        System.out.println("divide2 = " + divide2);

        // 7.将BigDecimal转成为double
        double doubleValue = divide2.doubleValue();
        System.out.println("doubleValue = " + doubleValue);
    }
}
