package xuan.extendhomework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date myBirthday = dateFormat.parse("2000-12-12");

        System.out.println(myBirthday);
    }
}
