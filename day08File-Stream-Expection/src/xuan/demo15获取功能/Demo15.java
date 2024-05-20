package xuan.demo15获取功能;

import java.io.File;
import java.text.SimpleDateFormat;

/*
目标：File类获取功能

File类可以获取文件或文件夹相关信息
    String getAbsolutePath() 获取绝对路径
    String getName() 获取名字, 获取路径中最后一个\右边的
    String getParent() 获取父路径,最后一个\左边的
    long length(获取"文件"大小, 单位是字节, 文件夹不能直接获取大小, 要把文件夹中的所有文件大小加起来就是文件夹的大小
    long lastModified() 获取文件的最后修改时间
 */
public class Demo15 {
    public static void main(String[] args) {
        // 创建File对象关联到文件
        File file1 = new File("F:\\MyFileTest\\aaa\\中国梦.txt");
        // 创建File对象关联到文件夹
        File file2 = new File("F:\\MyFileTest\\aaa\\bbb");

        // String getAbsolutePath() 获取绝对路径
        System.out.println("获取绝对路径：" + file1.getAbsolutePath());
        System.out.println("获取绝对路径：" + file2.getAbsolutePath());

        // String getName() 获取名字，获取路径中最后一个\右边的
        System.out.println(file1.getName());
        System.out.println(file2.getName());

        // String getParents() 获取父路径，最后一个\左边的
        System.out.println(file1.getParent());
        System.out.println(file2.getParent());

        // String getPath() 获取对象创建时的路径
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());

        // long length 获取”文件“大小，单位是字节，文件夹不能直接获取大小，要把文件夹的所有文件大小加起来就是文件夹大小
        System.out.println(file1.length());
        System.out.println(file2.length());

        // long lastModified() 获取文件最后修改时间
        long l = file1.lastModified();
        System.out.println("l = " + l);

        // 把 毫秒值 格式化为 时间字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(l);
        System.out.println("最后修改时间：" + format);
    }
}
