package xuan.extendhomework4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthday = sdf.parse("2000年12月12日");

        long l = System.currentTimeMillis() - birthday.getTime();
        System.out.println("我活了：" + l / 1000 / 3600 / 24 + "天");
    }
}
