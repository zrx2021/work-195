package xuan.demo08finally代码块;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标: 掌握finally代码块的作用

finally代码块作用
    在finally代码块中存放的代码都是一定会被执行的

什么样的代码放到finally中(了解)
    资源的释放(IO流的关闭, 锁的释放, 数据库连接的关闭)
 */
public class Demo08 {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
            Date date = sdf.parse("2024-05-19");
            System.out.println("date = " + date);
        } catch (ParseException e) {
            System.out.println("处理了异常: " + e);
            return; // 1.结束方法
        } finally {
            System.out.println("finally 一定会被执行!");
        }

        System.out.println("走我了吗?");
    }
}
