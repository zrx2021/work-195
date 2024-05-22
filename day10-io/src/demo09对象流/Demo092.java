package demo09对象流;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
保存3个Person对象到文件
    new Person("张三", 18)
    new Person("李四", 19)
    new Person("王五", 16)

文件中保存的3个对象数据到程序中
 */
public class Demo092 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        test01();
        test02();
    }

    // 对象输出流, 把Java对象数据保存到文件(序列化)
    public static void test01() throws IOException {
        Person p1 = new Person("张三", 18);
        Person p2 = new Person("李四", 19);
        Person p3 = new Person("王五", 16);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10-io\\abc\\person.txt"));
        // 把Java对象数据保存到文件(序列化)
        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.writeObject(p3);

        oos.close();
    }

    // 对象输入流, 读入文件中的数据成Java对象
    public static void test02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10-io\\abc\\person.txt"));

        // 读入文件中的数据成Java对象
        try {
            while (true) {
                Object o = ois.readObject();
                System.out.println("o = " + o);
            }
        } catch (Exception e) {
            System.out.println("读取失败: " + e);
        } finally {
            ois.close();
        }
    }
}
