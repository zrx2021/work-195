package xuan.demo02文件字节输出流;

import java.io.FileOutputStream;
import java.io.IOException;

/*
目标: 字节输出流写字节数据到文件

FileOutputStream注意:
    1.文件不存在会创建
    2.文件存在会清空文件
    3.把第二个参数append设置为true,不清空, 追加写数据

特别强调IO流操作文件, 进行文件数据的读写操作, IO流不能操作文件夹

如果输出流指定的路径是文件夹, 会出现: FileNotFoundException: day09-io\abc (拒绝访问。)
如果输出流指定的父路径不存在, 会出现: FileNotFoundException: day09-io\abc2\1.txt (系统找不到指定的路径。)
 */
public class Demo02 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字节输出流, 文件不存在会创建, 文件存在会清空文件, 再写入内容
        FileOutputStream fos = new FileOutputStream("day09-io/text/1.txt");
        // FileOutputStream fos = new FileOutputStream(new File("day09-io\\abc\\1.txt"));

        // 2.把程序数据写到流中
        // public void write(int b) 一次写一个字节到流中, 效率低
        fos.write(97);// a
        fos.write(98);// b

        byte[] bytes = {65, 66, 67, 68, 69};
        // public void write(byte b[]) 一次写一个字节数组字节到流中, 效率高
        fos.write(bytes);

        // public void write(byte b[], int off, int len) 一次写一个字节数组一部分到流中, 效率高
        // byte b[]: 数据
        // int off: 从数组哪个位置开始
        // int len: 个数
        // 包前包后
        fos.write(bytes, 0, 3);

        fos.write("我太喜欢这里啦！".getBytes());
        fos.write("\r\n".getBytes());// 表示换行
        fos.write("同学们说话又好听，人又帅".getBytes());

        fos.close();
    }
}
