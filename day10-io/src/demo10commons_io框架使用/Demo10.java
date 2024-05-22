package demo10commons_io框架使用;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
目标: 了解Commons-IO的常用功能
 */
public class Demo10 {
    public static void main(String[] args) throws IOException {
        // FileUtils的功能
        // public static void copyFile(File srcFile, File destFile): 复制文件
        // FileUtils.copyFile(new File("F:\\work195\\day10-IO流2\\3-视频\\01_字符缓冲流.wmv"), new File("F:\\MyFileTest\\复制测试视频1.wmv"));

        // public static void copyDirectory(File srcDir, File destDir): 复制文件夹
        // FileUtils.copyDirectory(new File("F:\\MyFileTest"), new File("F:\\MyFileTest2"));

        // public static void deleteDirectory(File directory): 删除文件夹
        // FileUtils.deleteDirectory(new File("F:\\MyFileTest2"));

        // public static String readFileToString(File file, String encoding): 读文件数据返回一个字符串
        // String str = FileUtils.readFileToString(new File("F:\\MyFileTest\\aaa\\中国梦.txt"));
        // System.out.println("str = " + str);

        // IOUtils的功能
        // public static int copy(InputStream inputStream, OutputStream outputStream): 复制文件
        // IOUtils.copy(new FileInputStream("F:\\work195\\day10-IO流2\\3-视频\\01_字符缓冲流.wmv"), new FileOutputStream("F:\\MyFileTest\\复制测试视频1.wmv"));
    }
}
