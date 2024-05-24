package extendhomework4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Demo1 {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream("day10-io\\homework\\extendhomework4.txt"), StandardCharsets.UTF_8);
            osw.write("我爱Java");
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持的编码异常");
        } catch (IOException e) {
            System.out.println("IO异常");
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
            } catch (IOException e) {
                System.out.println("关闭文件时遇到IO异常");
            }
        }
    }
}
