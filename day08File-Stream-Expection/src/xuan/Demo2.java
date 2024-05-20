package xuan;

import java.io.File;

public class Demo2 {
    public static void main(String[] args) {
        File file = new File("C:\\");
        listJava(file);
    }

    public static void listJava(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                if (file.getName().equals("javaw.exe")) {
                    System.out.println(file);
                }
            } else {
                listJava(file);
            }
        }
    }
}
