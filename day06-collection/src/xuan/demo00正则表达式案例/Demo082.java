package xuan.demo00正则表达式案例;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    信息爬取, 获取字符串中的邮箱
 */
public class Demo082 {

    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，" +
                "电话：13888888888，13777777777" +
                "或者联系邮箱：boniu@itcast.com.cn" +
                "座机电话：01036517895，010-98951256" +
                "邮箱：bozai@itcast.cn，" +
                "邮箱2：zhangsan0009@163.com，" +
                "热线电话：400-618-9090，400-618-4000，" +
                "4006184000，4006189090";

        // 有邮箱规则
        // 使用正则表达式进行查找
        // 1.创建Pattern对象, 表示正则表达式
        // Pattern pattern = Pattern.compile("\\w{5,}@[0-9a-zA-Z]+(\\.[a-zA-Z]{2,4}){1,2}");
        Pattern pattern = Pattern.compile("1[3-9]\\d{9}");
        // 2.使用Pattern对象进行匹配
        Matcher matcher = pattern.matcher(data);

        // 3.循环查找符合规则的内容
        while (matcher.find()) {
            // 4.如果找到就获取内容
            String group = matcher.group();
            System.out.println("找到了: " + group);
        }
    }
}
