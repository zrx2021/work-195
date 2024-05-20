package xuan.demo06异常概念和体系;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo06 {
    public static void main(String[] args) {
        // 运行时异常
        // -------------------数学计算异常-------------------
        // int a = 10 / 0; // ArithmeticException
        // System.out.println(a);

        // -------------------数组索引越界异常-------------------
        // int[] arr = {11, 22, 33};
        // int num = arr[6];
        // System.out.println(num); // ArrayIndexOutOfBoundsException

        // -------------------空指针异常-------------------
        // String str = null;
        // System.out.println(str.length()); // NullPointerException

        // -------------------类型转换异常-------------------
        // Object obj = new String("aaa");
        // Date d = (Date)obj; // ClassCastException
        // System.out.println(d);

        // 编译时异常, 给程序员强烈提醒, 一定处理, 否则通不过编译
        // -------------------日期解析异常-------------------
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Date date = sdf.parse("2022-02-03");
        // System.out.println("date = " + date);
    }
}
