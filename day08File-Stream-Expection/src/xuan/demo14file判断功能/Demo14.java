package xuan.demo14file判断功能;

import java.io.File;

/*
目标：File类判断功能

File类判断功能:
    1.boolean isDirectory() 是否是文件夹, 如果是文件夹返回true
    2.boolean isFile() 是否是文件, 如果是文件返回true
    3.boolean exists() 判断是否存在, 只要存在就返回true
 */
public class Demo14 {
    public static void main(String[] args) {
        File file1 = new File("D:\\MyFileTest\\aaa");
        File file2 = new File("D:\\MyFileTest\\d.txt");
        File file3 = new File("D:\\MyFileTest\\hehe");

        // 1.boolean isDirectory() 是否是文件夹/目录, 如果是文件夹返回true
        System.out.println(file1.isDirectory()); // true
        System.out.println(file2.isDirectory()); // false

        // 2.boolean isFile() 是否是文件, 如果是文件返回true
        System.out.println(file1.isFile()); // false
        System.out.println(file2.isFile()); // true

        // 3.boolean exists() 判断是否存在, 只要存在就返回true
        System.out.println(file1.exists()); // true
        System.out.println(file2.exists()); // true
        System.out.println(file3.exists()); // false
    }
}
