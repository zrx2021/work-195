package demo09对象流;

import java.io.*;

/*
目标: 学习对象输入流和对象输出流的使用

注意: 如果需要把对象序列化到文件, 这个类需要实现Serializable接口
    Serializable接口是一个标记接口,主要是提示Java这个类的对象会序列化到文件

    如果对象的某些属性不想保存, 使用 transient 修饰
 */
public class Demo091 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        test01();
        test02();
    }

    // 对象输出流, 把Java对象数据保存到文件(序列化)
    public static void test01() throws IOException {
        Person p = new Person("凤姐", 18);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day10-io\\abc\\person.txt"));
        // 把Java对象数据保存到文件(序列化)
        oos.writeObject(p);

        oos.close();
    }

    // 对象输入流, 读入文件中的数据成Java对象
    public static void test02() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day10-io\\abc\\person.txt"));

        // 读入文件中的数据成Java对象
        Object obj = ois.readObject();
        Person p = (Person) obj;
        System.out.println("p = " + p);
        // obj = ois.readObject(); // EOFException: 如果文件中没有对象数据啦, 出现异常 End Of File

        ois.close();
    }
}
