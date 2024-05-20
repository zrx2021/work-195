package xuan.homework6;

import java.io.File;
import java.util.Scanner;

public class Demo1 {
    private static long totalSize = 0L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
        String path = sc.next();
        File file = new File(path);

        calcSize(file);
        System.out.println("文件夹“" + file.getPath() + "”的总大小是：" + totalSize + "字节");

        long totalValue = calcSize2(file);
        System.out.println("文件夹“" + file.getPath() + "”的总大小是：" + totalValue + "字节");
    }

    public static void calcSize(File path) {
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                totalSize += file.length();
            } else {
                calcSize(file);
            }
        }
    }

    public static long calcSize2(File path) {
        long size = 0L;
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                size += file.length();
            } else {
                size += calcSize2(file);
            }
        }
        return size;
    }
}
