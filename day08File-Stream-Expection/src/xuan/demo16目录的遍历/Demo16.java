package xuan.demo16目录的遍历;

import java.io.File;

/*
目标:学习File遍历文件夹

以前我们学过数组或集合的遍历:遍历就是取出里面的所有数据

File类
    public String[] list(): 返回文件夹中所有内容的名字
    public File[] listFiles(): 返回文件夹中所有内容的File对象, 有利于后续操作(推荐使用)

注意:
    当调用者是一个文件夹，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
    当调用者者路径不存在时，返回null
    当调用者是文件，返回null
    当调用者是一个文件夹，但是没有权限访问该文件夹时，返回null
 */
public class Demo16 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\MyFileTest\\aaa");

        // public String[] list(): 返回文件夹中所有内容的名字 (双击文件夹)
        // String[] list = file.list();
        // for (String s : list) {
        //     System.out.println(s);
        // }

        // public File[] listFiles(): 返回文件夹中所有内容的File对象, 有利于后续操作(推荐使用) (双击文件夹)
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

        // 当调用者是一个文件夹，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        // 当调用者者路径不存在时，返回null
        // File file2 = new File("D:\\MyFileTest\\ppp");

        // 当调用者是文件，返回null
        // File file2 = new File("D:\\MyFileTest\\d.txt");

        // 当调用者是一个文件夹，但是没有权限访问该文件夹时，返回null
        File file2 = new File("D:\\MyFileTest\\ccc");

        File[] listFiles = file2.listFiles();
        System.out.println("listFiles = " + listFiles);
        for (File listFile : listFiles) {

        }
    }
}
