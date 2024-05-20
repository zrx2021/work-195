package xuan.demo19文件搜索;

import java.io.File;

/*
目标: 使用递归完成文件夹中内容的搜索

递归的使用场景: 对文件夹进行操作, 如果文件夹中还有文件夹, 也要操作, 就用递归
 */
public class Demo19 {
    public static void main(String[] args) {
        // 1.创建一个File对象定位aaa文件夹
        File file = new File("D:\\MyFileTest\\aaa");

        listJava(file);
    }

    /**
     * 2.定义一个方法listJava(File dir), 列出某个文件夹中的所有java文件
     * @param dir 要搜索的文件夹
     */
    public static void listJava(File dir) {
        // 2.1.调用listFiles()显示文件夹中的所有内容
        File[] files = dir.listFiles();

        // 2.2.遍历获取每个内容
        for (File file : files) {
            if (file.isFile()) {
                // 2.3.判断如果是文件, 得到文件名, 判断是否是.java结尾, 其他文件不管
                if (file.getName().endsWith(".java")) {
                    System.out.println(file);
                }
            } else {
                // 2.4.如果是文件夹,再次调用listJava
                listJava(file);
            }
        }
    }
}
