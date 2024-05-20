package xuan.demo12File创建功能;

import java.io.File;
import java.io.IOException;

/*
目标：File类创建功能

File类创建功能:
    1.boolean createNewFile() 创建新文件, true表示创建成功
    2.boolean mkdir() make directory 创建单级文件夹, true表示创建成功
    3.boolean mkdirs() 创建多级文件夹, true表示创建成功
*/
public class Demo12 {
    public static void main(String[] args) throws IOException {
        // 1.boolean createNewFile() 创建新文件, true表示创建成功
        File file1 = new File("F:\\MyFileTest\\demo.txt");
        System.out.println(file1.createNewFile());

        File file2 = new File("F:\\MyFileTest\\demo");
        System.out.println(file2.mkdir());

        File file3 = new File("F:\\MyFileTest\\demo\\1\\2");
        System.out.println(file3.mkdirs());
    }
}
