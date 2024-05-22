package demo01字符缓冲流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("day10-io\\abc\\2.txt"))) {
            // 循环读取一行
            String line; // 保存读取的一行数据
            while ((line = br.readLine()) != null) {
                // line = "张三,18"
                String[] split = line.split(",");
                System.out.println("姓名是" + split[0] + ", 年龄是" + split[1] + "岁");
            }
        } catch (FileNotFoundException e) {
            System.out.println("处理了文件没有找到: " + e);
        } catch (IOException e) {
            System.out.println("处理了IO异常: " + e);
        }
    }
}
