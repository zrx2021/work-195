package extendhomework18;

import java.io.*;
import java.util.Scanner;

// 递归复制某个文件夹中的所有文件和文件夹
public class Demo1 {
    public static void main(String[] args) {
        File srcDir = inputFile();
        File destDir = new File("F:\\MyFileTest\\copytestdir");
        copyDir(srcDir, destDir);
    }

    private static void copyDir(File srcDir, File destDir) {
        System.out.println("srcDir：" + srcDir + "，destDir：" + destDir);
        File[] files = srcDir.listFiles();

        if (!destDir.exists()) {
            destDir.mkdir();
        }

        for (File file : files) {
            if (file.isFile()) {
                copyFile(file, destDir);
            } else if (file.isDirectory()) {
                copyDir(new File(srcDir, file.getName()), new File(destDir, file.getName()));
            }
        }
    }

    private static void copyFile(File file, File destDir) {
        String destFilePath = destDir.getPath() + "\\" + file.getName();
        System.out.println("destFilePath：" + destFilePath);
        File destFile = new File(destFilePath);

        if (!file.exists() || file.isDirectory()) {
            System.out.println("文件不存在或文件是一个文件夹！" + file.getPath() + file.getName());
            return;
        }

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile)); BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("文件IO异常");
        }
    }

    private static File inputFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        // 接收用户输入的路径
        String filePath = sc.nextLine();
        // 根据路径字符串创建文件对象
        File dir = new File(filePath);
        if (!dir.exists()) throw new RuntimeException("你输入的文件路径不存在！！！");
        // 判断是否是文件夹
        if (!dir.isDirectory()) {
            throw new RuntimeException("输入的路径不是文件夹路径！！！");
        }
        return dir;
    }
}
