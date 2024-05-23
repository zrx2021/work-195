package xuan.homework4;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        KeyCopyThread ct = new KeyCopyThread();
        ct.start();

        KeyCopyRunnable cr = new KeyCopyRunnable();
        Thread thread = new Thread(cr);
        thread.start();
    }

    public static void copyFile(String inFile, String outFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inFile)); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outFile))) {
            int len;
            byte[] bytes = new byte[1024 * 8];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常" + e);
        } catch (IOException e) {
            System.out.println("文件IO异常");
        }
    }
}
