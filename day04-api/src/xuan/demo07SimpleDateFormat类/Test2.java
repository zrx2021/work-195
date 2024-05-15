package xuan.demo07SimpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 计算你出生到现在有多少天
// 活着的时间 = 现在的时间 - 出生的时间

public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 1.创建Date对象,现在的时间
        Date currentTime = new Date();

        // 2.定义String变量保存出生的时间字符串
        String birthDay = "2000-12-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // 3.出生的时间字符串解析为Date对象
        Date birthDate = sdf.parse(birthDay);

        // 4.活着的时间的毫秒值 = 现在的时间毫秒值 - 出生时间的毫秒值
        long liveTime = currentTime.getTime() - birthDate.getTime();

        // 5.活着的时间的毫秒值转换为天
        long days = liveTime / 1000 / 3600 / 24;

        System.out.println("活着的时间：" + days + "天");
    }
}
