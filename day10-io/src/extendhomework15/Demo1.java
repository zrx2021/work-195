package extendhomework15;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream("day10-io\\homework\\beauty.png"));
            bos = new BufferedOutputStream(new FileOutputStream("day10-io\\homework\\beauty-copy.png"));

            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("文件IO异常");
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时IO异常");
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时IO异常");
                }
            }
        }
    }
}
