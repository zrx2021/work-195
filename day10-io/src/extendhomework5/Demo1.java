package extendhomework5;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream("day10-io\\homework\\extendhomework4.txt"), "utf8");
            int len;
            while ((len = isr.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持编码异常");
        } catch (IOException e) {
            System.out.println("读取文件时IO异常");
        } finally {
            try {
                if (isr != null) {
                    isr.close();
                }
            } catch (IOException e) {
                System.out.println("关闭文件时异常！");
            }
        }
    }
}
