package demo02缓冲流效率对比;

import java.io.*;

/*
目标:使用四种方式复制 "D:/MyFileTest/高清无码.flv" 到 "D:/MyFileTest/高清无码1.flv"

四种方式复制:
    基本流读写一个字节
    基本流读写一个字节数组
    缓冲流读写一个字节
    缓冲流读写一个字节数组

小结:
    缓冲流读写一个字节比基本流读取一个字节快非常多
    缓冲流读写一个字节数组和基本流读取一个字节数组差不多

    如果使用读写一个字节时,建议使用缓冲流
    如果使用读写一个字节数组,建议使用基本流
 */
public class Demo04 {
    public static void main(String[] args) {
        // test01(); // 基本流读写一个字节          136966
        // test03(); // 缓冲流读写一个字节            1227

        test02(); // 基本流读写一个字节数组         185
        test04(); // 缓冲流读写一个字节数组         49
    }

    // 基本流读写一个字节
    public static void test01() {
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("F:/MyFileTest/测试视频.wmv");
             FileOutputStream fos = new FileOutputStream("D:/MyFileTest/测试视频1.wmv")) {
            // 循环读写
            int b; // 保存读取的数据
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println("异常: " + e);
        }
        long end = System.currentTimeMillis();
        System.out.println("基本流读写一个字节消耗时间: " + (end - start));
    }

    // 基本流读写一个字节数组
    public static void test02() {
        long start = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("F:/MyFileTest/测试视频.wmv");
             FileOutputStream fos = new FileOutputStream("F:/MyFileTest/测试视频2.wmv")) {
            // 循环读写
            byte[] buf = new byte[8192]; // 保存读取的数据
            int len; // 保存读取的数量
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("异常: " + e);
        }
        long end = System.currentTimeMillis();
        System.out.println("基本流读写一个字节数组消耗时间: " + (end - start));
    }

    // 缓冲流读写一个字节
    public static void test03() {
        long start = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:/MyFileTest/测试视频.wmv"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/MyFileTest/测试视频3.wmv"))) {
            // 循环读写
            int b; // 保存读取的数量
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            System.out.println("异常: " + e);
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流读写一个字节消耗时间: " + (end - start));
    }

    // 缓冲流读写一个字节数组
    public static void test04() {
        long start = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:/MyFileTest/测试视频.wmv"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:/MyFileTest/测试视频4.wmv"))) {
            // 循环读写
            byte[] buf = new byte[8192]; // 8192
            int len;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("异常: " + e);
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流读写一个字节数组消耗时间: " + (end - start));
    }
}
