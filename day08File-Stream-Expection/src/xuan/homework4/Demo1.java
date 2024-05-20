package xuan.homework4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
        String path = sc.next();

        File file = new File(path);

        if (!file.exists()) {
            boolean isSuccess = file.createNewFile();
            System.out.println("isSuccess = " + isSuccess);
        } else if (file.isFile()) {
            System.out.println("文件大小是：" + file.length() + "字节");
        }
    }
}
