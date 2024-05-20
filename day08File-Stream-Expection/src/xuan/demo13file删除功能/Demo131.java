package xuan.demo13file删除功能;

import java.io.File;

/*
    目标：File类删除功能

    File类删除功能:
        boolean delete() 可以删除文件和文件夹,删除成功返回true

    删除目录时的注意事项:
        delete方法直接删除不走回收站
        如果删除的是一个有内容文件夹，需要先删除文件夹中的内容，最后才能删除文件夹
*/
public class Demo131 {
    public static void main(String[] args) {
        // 1.boolean delete() 删除文件,删除成功返回true
        File file1 = new File("F:\\MyFileTest\\demo.txt");
        System.out.println(file1.delete());

        // 3.有内容的文件夹，需要先删除文件夹里面的内容，再删除空文件夹
        File file2 = new File("F:\\MyFileTest\\demo\\1\\2");
        System.out.println(file2.delete());

        File file3 = new File("F:\\MyFileTest\\demo\\1");
        System.out.println(file3.delete());
    }
}
