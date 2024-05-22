package demo12properties属性文件;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
目标: 学习Properties读取文件中的键值对数据
 */
public class Demo122 {
    public static void main(String[] args) throws IOException {
        // 1.创建Properties对象
        Properties pp = new Properties();
        System.out.println("pp = " + pp);// {}

        // 2.使用Properties读取文件中的键值对数据
        FileReader fr = new FileReader("day10-io\\abc\\info.properties");
        pp.load(fr); // 内部会从文件中一行一行读取,使用=切割, 得到键和值, 使用setProperty添加到集合中
        System.out.println("加载后 pp = " + pp); // {迪丽热巴=123456, 古力娜扎=abcdef}

        // 3.通过键获取值
        String value1 = pp.getProperty("迪丽热巴");
        System.out.println("value1 = " + value1);
        String value2 = pp.getProperty("马尔扎哈");
        System.out.println("value2 = " + value2);

        // 4.遍历
        // stringPropertyNames()：获取所有属性名，相同于keySet()
        // 获取所有键
        Set<String> propertyNames = pp.stringPropertyNames();
        System.out.println("propertyNames = " + propertyNames);
        // 遍历获取每个键
        for (String propertyName : propertyNames) {
            // 通过键获取值
            String propertyValue = pp.getProperty(propertyName);
            System.out.println(propertyName + " == " + propertyValue);
        }

        System.out.println("---------------");

        pp.forEach((k, v) -> {
            System.out.println(k + " === " + v);
        });
    }
}
