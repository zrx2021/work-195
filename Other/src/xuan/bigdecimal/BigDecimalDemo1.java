package xuan.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", '男', 20, 79.5);
        Student s2 = new Student("李四", '女', 21, 80.2);
        Student s3 = new Student("王五", '男', 22, 77.9);
        Student s4 = new Student("周六", '男', 20, 55.8);
        Student s5 = new Student("赵七", '女', 21, 99.9);

        BigDecimal sum = new BigDecimal("0");
        sum = sum.add(BigDecimal.valueOf(s1.getScore()));
        sum = sum.add(BigDecimal.valueOf(s2.getScore()));
        sum = sum.add(BigDecimal.valueOf(s3.getScore()));
        sum = sum.add(BigDecimal.valueOf(s4.getScore()));
        sum = sum.add(BigDecimal.valueOf(s5.getScore()));

        BigDecimal average = sum.divide(BigDecimal.valueOf(5), 2, RoundingMode.HALF_UP);
        System.out.println("average = " + average);
    }
}
