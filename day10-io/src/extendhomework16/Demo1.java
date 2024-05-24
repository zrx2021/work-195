package extendhomework16;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 4};
        int sum = 0, max = arr[0], min = arr[0];

        for (int number : arr) {
            // 1.求和
            sum += number;

            // 2.求最大值
            if (number > max) {
                max = number;
            }

            // 3.求最小值
            if (number < min) {
                min = number;
            }
        }

        BigDecimal sumBD = new BigDecimal(sum);
        BigDecimal length = BigDecimal.valueOf(arr.length);
        BigDecimal average = sumBD.divide(length, 3, RoundingMode.HALF_UP);

        // 使用相对路径寻找文件，以便项目迁移时无需修改路径
        try (PrintWriter pw = new PrintWriter(new FileWriter("day10-io\\homework\\number.txt", true))) {
            pw.println("最大值：" + max + "，最小值：" + min + "，平均值：" + average.doubleValue());
        } catch (IOException e) {
            System.out.println("读取文件时出现IO异常");// 非严格处理方式
        }
    }
}
