package xuan.demo07SimpleDateFormat类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        String str = sdf.format(date);
        System.out.println("str = " + str);
    }
}