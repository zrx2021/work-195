package extendhomework19;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        copyFile("day10-io\\homework\\gbk-a.txt", "day10-io\\homework\\c.txt", "gbk");
        copyFile("day10-io\\homework\\utf8-b.txt", "day10-io\\homework\\c.txt", "utf8");
    }

    private static void copyFile(String srcFile, String destFile, String encoding) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(srcFile), encoding); OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(destFile, true))) {
            char[] chars = new char[1024 * 8];
            int len;
            while ((len = isr.read(chars)) != -1) {
                osw.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持的编码异常");
        } catch (IOException e) {
            System.out.println("文件IO异常");
        }

    }
}
