package xuan.homework4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 12.定义CopyRunnable类实现Runnable接口
public class KeyCopyRunnable implements Runnable {
    // 13.重写run方法
    @Override
    public void run() {
        // 14.创建FileInputStream文件字节输入流关联源文件
        // 15.创建FileOutputStream文件字节输出流关联目的地文件
        try (FileInputStream fis = new FileInputStream("D:\\MyFileTest\\测试视频.wmv");
             FileOutputStream fos = new FileOutputStream("D:\\MyFileTest\\测试视频2.wmv");) {

            // 16.创建字节数组buf大小为1024 * 8收到保存读取的数据
            byte[] buf = new byte[1024 * 8];
            // 17.int类型变量len保存读取的长度
            int len;
            // 18.使用while循环,在循环条件中使用文件字节输入流的read方法读取源文件的数据保存到buf数组中,读取的数量保存到len中,判断是否读取到文件末尾
            while ((len = fis.read(buf)) != -1) {
                // 19.在while循环体中使用文件字节输出流的write方法把读取的数据写到目的地中
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("复制失败: " + e);
        }
    }
}