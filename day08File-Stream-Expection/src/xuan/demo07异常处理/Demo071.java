package xuan.demo07异常处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
目标: 异常的处理

使用SimpleDateFormat演示try...catch处理异常
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
    Date date = sdf.parse("2020年12月13日");
    System.out.println("date = " + date);

throws抛出异常的快捷键:
    1.光标在红色波浪线的地方 -> alt + 回车 -> Add exception to method signature

try...catch快捷键:
    1.光标在红色波浪线的地方 -> alt + 回车 -> Surround with try/catch
    2.光标在红色波浪线的地方 -> ctrl + alt + t -> try/catch *****推荐

如果异常抛给JVM, JVM默认处理异常:
    1.打印异常信息
    2.停止程序
 */
public class Demo071 {
    public static void main(String[] args) {
        try {
            test01();
        } catch (ParseException e) {
            // 处理异常的代码(工作中, 记录异常信息到文件或数据库, 给用户弹框提示)
            System.out.println("处理了日期解析异常: " + e);
        }
        System.out.println("走我了吗?");
    }

    public static void test01() throws ParseException {
        // 时间格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse("2024-05-19");
        System.out.println("date = " + date);
    }
}
