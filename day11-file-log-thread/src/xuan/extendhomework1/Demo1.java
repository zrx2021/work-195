package xuan.extendhomework1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("day11-file-log-thread/src/config.properties"));
            Set<String> strings = properties.stringPropertyNames();

            for (String string : strings) {
                String property = properties.getProperty(string);
                System.out.println(string + "：" + property);
            }

            properties.setProperty("nickname", "admin");
            properties.setProperty("age", "18");

            properties.store(new FileWriter("day11-file-log-thread\\src\\output.properties"), "测试输出");
        } catch (IOException e) {
            System.out.println("文件IO异常");
        }

    }
}
