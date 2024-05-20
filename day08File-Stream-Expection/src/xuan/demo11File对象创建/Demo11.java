package xuan.demo11File对象创建;

import java.io.File;

/*
目标: 学习File构造器的使用
File类构造器:
    File(String pathname) 通过字符串路径创建File对象(重要)
    File(String parent, String child) 根据父路径和子路径创建File对象

注意: 路径分隔符问题
    Windows默认使用\,   也可以使用/
    Linux或MacOS默认是/

绝对路径: 从盘符开始的, 例如: D:\MyFileTest\aaa     在IDEA的文件或文件夹上右键 -> Copy Path/Reference -> Absoulte Path(复制绝对路径)
相对路径: 不从盘符开始, 从项目路径开始   模块名\其他名称
 */
public class Demo11 {
    public static void main(String[] args) {
        // 1.File(String pathname) 通过字符串路径创建File对象(重要)
        File file = new File("D:\\MyFileTest\\aaa");
        System.out.println("file = " + file); // D:\MyFileTest\aaa

        // 2.File(String parent, String child) 根据父路径和子路径创建File对象
        File file2 = new File("D:\\MyFileTest", "ggg");
        System.out.println(file2); // D:\MyFileTest\ggg

        // 3.File(File parent, String child) 根据父路径和子路径创建File对象
        File file3 = new File(file, "jjj");
        System.out.println(file3); // D:\MyFileTest\aaa\jjj

        // 使用绝对路径
        // File file4 = new File("D:\\code\\IdeaProjects\\java-up-195\\day08-stream-exception-file\\src\\com\\itheima\\demo01体验Stream流\\Demo01.java");

        // 使用相对路径(开发都是使用相对路径, 灵活, 通用)
        File file4 = new File("day08-stream-exception-file\\src\\com\\itheima\\demo01体验Stream流\\Demo01.java");
    }
}
