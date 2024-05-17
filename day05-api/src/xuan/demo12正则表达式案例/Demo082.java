package xuan.demo12正则表达式案例;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo082 {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，电话：13888888888，1377777777或者联系邮箱：boniu@itcast.com.cn座机电话：01036517895，010-98951256邮箱：bozai@itcast.cn，邮箱2：zhangsan0009@163.com，热线电话：400-618-9090，400-618-4000，4006184000，4006189090";
        // 1.创建使用compile方法创建Patter对象
        Pattern pattern = Pattern.compile("1[3-9]\\d{9}");

        // 2.使用pattern.matcher获得匹配对象
        Matcher matcher = pattern.matcher(data);

        // 3.使用matcher.find()方法循环查找内容
        while (matcher.find()) {
            // 4.使用group提取查找内容
            String group = matcher.group();
            System.out.println("找到了：" + group);
        }
    }
}
