package xuan.demo06文件复制;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\work195\\day09-IO流1\\3-视频\\00_作业.wmv");
        FileOutputStream fos = new FileOutputStream("day09-io/text/00_作业-副本.wmv");

        // byte[] bytes = new byte[8 * 1024];
        // int len;
        // while ((len = fis.read(bytes)) != -1) {
        //     fos.write(bytes, 0, len);
        // }

        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);

        fis.close();
        fos.close();
    }
}
