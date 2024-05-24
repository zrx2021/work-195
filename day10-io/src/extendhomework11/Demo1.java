package extendhomework11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo1 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;

        try {
            isr = new InputStreamReader(new FileInputStream("day10-io\\homework\\test.txt"), "gbk");
            osw = new OutputStreamWriter(new FileOutputStream("day10-io\\homework\\test2.txt"), StandardCharsets.UTF_8);
            char[] chars = new char[20];
            int len;
            while ((len = isr.read(chars)) != -1) {
                osw.write(chars, 0, len);
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("编码不支持");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("读入文件时出现IO异常");
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时出现IO异常");
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时出现IO异常");
                }
            }
        }
    }
}
