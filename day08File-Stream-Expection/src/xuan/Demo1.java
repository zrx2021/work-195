package xuan;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹的路径：");
        String dir = sc.next();

        File startDir = new File(dir);
        searchFiles(startDir, 0);
    }

    private static void searchFiles(File startDir, int count) {
        File[] files = startDir.listFiles();
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("│   ");
            }

            File file = files[i];
            if (file.isDirectory()) {
                System.out.println("└- " + file.getName());
                searchFiles(file, count + 1);
            } else {
                if (i != files.length - 1) {
                    System.out.println("├- " + file.getName());
                } else if (i == files.length - 1) {
                    System.out.println("└- " + file.getName());
                }
            }
        }
    }
}
