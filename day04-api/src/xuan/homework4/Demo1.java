package xuan.homework4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = sdf.format(date);
        System.out.println("format = " + format);

        long currentTime = System.currentTimeMillis();
        System.out.println("sdf.format(currentTime) = " + sdf.format(currentTime));
    }
}
