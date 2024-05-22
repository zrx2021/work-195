package demo12properties属性文件;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
目标: 学习Properties存储数据到文件
 */
public class Demo121 {
    public static void main(String[] args) throws IOException {
        // 1.创建Properties对象
        Properties pp = new Properties();
        System.out.println("pp = " + pp);// {}

        // 2.增加键值对数据 数据在堆内存中
        pp.setProperty("迪丽热巴", "123456");
        pp.setProperty("古力娜扎", "abcdef");
        System.out.println("存储数据后 pp = " + pp);// {迪丽热巴=123455, 古力娜扎=abcdef}

        // 3.把Properties集合数据存储数据到文件
        FileWriter fw = new FileWriter("F:\\java\\work-195\\day10-io\\abc\\info.properties");
        pp.store(fw, "保存用户名和密码");
        fw.close();
    }
}
