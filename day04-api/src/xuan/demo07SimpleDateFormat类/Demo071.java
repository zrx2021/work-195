package xuan.demo07SimpleDateFormat类;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo071 {
    public static void main(String[] args) {
        Date now = new Date();

        // SimpleDateFormat sdf = new SimpleDateFormat();// 默认时间格式：2024/5/13 上午11:52
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 2024-05-13 11:53:10

        // 调用format方法，把Date对象 格式化成 时间字符串
        String str = sdf.format(now);
        System.out.println("str = " + str);
    }
}
