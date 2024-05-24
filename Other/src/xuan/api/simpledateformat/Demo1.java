package xuan.api.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        int length = str1.trim().split("\\s+").length;

        if(length != 6) {
            System.out.println("您输入的数据不合理");
            return;
        }

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy MM dd HH mm ss");
        Date BeijingTime = sdf2.parse(str1);

        long NewYorkTimeMills = BeijingTime.getTime() - 12 * 3600 * 1000;
        Date NewYorkTime = new Date(NewYorkTimeMills);

        System.out.println("北京时间为：" + sdf.format(BeijingTime));
        System.out.println("纽约时间为：" + sdf.format(NewYorkTime));
    }
}
