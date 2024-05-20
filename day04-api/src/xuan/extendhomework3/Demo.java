package xuan.extendhomework3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        calendar.add(Calendar.DAY_OF_MONTH, 500);
        Date time = calendar.getTime();
        String format = sdf.format(time);
        System.out.println("500天后是：" + format);
    }
}
