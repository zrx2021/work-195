package xuan.homework5;

import java.io.File;

public class Demo1 {
    public static void main(String[] args) {
        // 1. 根据指定路径创建File对象
        File aaa = new File("F:\\MyFileTest\\aaa");
        listFiles(aaa);
    }

    public static void listFiles(File dir) {
        // 2.1.使用listFiles()方法获得该文件夹下的所有内容
        File[] files = dir.listFiles();
        // 2.2.遍历File数组
        for (File file : files) {
            // 2.3.判断是否是文件
            if (file.isFile()) {
                // 2.4.如果是文件,打印文件的绝对路径
                System.out.println(file);
            } else {
                // 2.5.如果是文件夹，递归调用当前方法
                listFiles(file);
            }

        }
    }
}
