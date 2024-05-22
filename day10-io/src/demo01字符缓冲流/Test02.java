package demo01字符缓冲流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
目标:拷贝出师表到另一个文件，恢复顺序
    1.定义一个缓存字符输入流管道与源文件接通
    2.定义一个List集合存储读取的每行数据
    3.定义一个循环按照行读取数据，存入到List集合中去
    4.对List集合中的每行数据按照首字符编号升序排序
    5.定义一个缓存字符输出管道与目标文件接通
    6.遍历List集合中的每个元素，用缓冲输出管道写出并换行
 */
public class Test02 {
    public static void main(String[] args) {
        // 1.定义一个缓冲字符输入流管道与源文件接通
        // 5.定义一个缓冲字符输出管道与目标文件接通
        try (BufferedReader br = new BufferedReader(new FileReader("day10-io\\abc\\csb.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("day10-io\\abc\\csb2.txt"));) {
            // 2.定义一个List集合存储读取的每行数据
            List<String> list = new ArrayList<>();

            // 3.定义一个循环按照行读取数据，存入到List集合中去
            String line; // 保存读取的一行数据
            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            // 4.对List集合中的每行数据按照首字符编号升序排序
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    // o1 = "11.嘿嘿"
                    // o2 = "8.愿陛下"
                    // 使用.切割, 拿到前面字符串, 转成数字, 再比较
                    String s1 = o1.split("\\.")[0];
                    String s2 = o2.split("\\.")[0];
                    // "11" -> 11       "8" -> 8
                    return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
                }
            });

            // 6.遍历List集合中的每个元素，用缓冲输出管道写出并换行
            for (String str : list) {
                bw.write(str);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("处理了文件找不到异常: " + e);
        } catch (IOException e) {
            System.out.println("处理了IO异常: " + e);
        }
    }
}
