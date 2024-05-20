package xuan.extendhomework5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2016-12-18");
        sdf.applyPattern("yyyy年MM月dd日");
        String format = sdf.format(date);
        System.out.println(format);
    }
}
