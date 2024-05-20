package xuan.demo8字符输入流;

import java.io.FileReader;

/*
目标: 使用字符流读取字符数据
 */
public class Demo082 {
    public static void main(String[] args) throws Exception{
        // 1.创建文件字符输入流
        FileReader fr = new FileReader("day09-io\\text\\1.txt");

        // 2.读取一个字符数据
        // public int read()：一次读取一个字符数据，返回值就是读取的字符数据，读取不到会返回-1
        // int ch;
        // while ((ch = fr.read()) != -1) {
        //     System.out.println((char) ch);
        // }

        System.out.println("---------------");

        // 2.读取多个字符数据
        char[] buf = new char[3];// 保存读取的字符数据
        int len;// 保存读取的数量
        while ((len = fr.read(buf)) != -1) {
            System.out.println(new String(buf, 0, len));
        }

        // 3.关闭流
        fr.close();
    }
}
