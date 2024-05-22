package demo08数据流;

import java.io.*;

/*
目标:学习数据流的使用
 */
public class Demo08 {
    public static void main(String[] args) throws IOException {
        test01();
        test02();
    }

    // 数据输入流, 从文件读取给中类型的数据到程序
    public static void test02() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("day10-io\\abc\\dos.txt"));

        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());

        dis.close();
    }

    // 数据输出流, 把各种类型的数据写到文件中
    public static void test01() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("day10-io\\abc\\dos.txt"));

        dos.writeInt(97);
        dos.writeChar('好');
        dos.writeBoolean(true);
        dos.writeDouble(6.66);
        dos.writeUTF("IO流真好玩");

        dos.close();
    }
}
