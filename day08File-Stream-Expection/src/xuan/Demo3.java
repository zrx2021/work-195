package xuan;

import java.io.File;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个路径");
        String path = sc.next();
        File file = new File(path);

        searchAndDelete(file);
    }

    private static void searchAndDelete(File file) {
        File[] files = file.listFiles();
    }
}
