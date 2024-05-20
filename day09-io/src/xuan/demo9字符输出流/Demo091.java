package xuan.demo9字符输出流;

import java.io.FileWriter;
import java.io.IOException;

/*
目标: 使用字符输出流写字符数据到文件

关于换行
    Linux换行: \n
    MacOS换行: \r
    Windows换行: \r\n 为了兼容其他系统 \n, \r
 */
public class Demo091 {
    public static void main(String[] args) throws IOException {
        // 1.创建文件字符输出流
        FileWriter fw = new FileWriter("day09-io\\text\\5.txt");

        // 2.调用write方法写字符数据到文件
        // public void write(int c)：写一个字符数组到流中
        fw.write('废');

        char[] chs = new char[]{'我', '想', '要', '个', '同', '桌'};
        // public void write(char cbuf[])：写一个字符数组到流中
        fw.write(chs);

        // public void write(char cbuf[], int off, int len)：写字符数组的一部分到流中
        // char cbuf[]：字符数组
        // int off：从哪个索引开始写
        // int len：数量
        fw.write(chs, 0, 2);

        String str = "寒冷的天气使人年轻，冻的像个孙子似的";
        // public void write(String str)：写字符串到流中
        fw.write("\r\n");
        fw.write(str);

        fw.write("\r\n");
        // public void write(String str, int off, int len)
        // String str：字符串
        // int off：从哪个索引开始写
        // int len：数量
        fw.write(str, 0, 5);

        // 3.关闭流
        fw.close();
    }
}
