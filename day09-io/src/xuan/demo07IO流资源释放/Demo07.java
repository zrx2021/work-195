package xuan.demo07IO流资源释放;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo07 {
    public static void main(String[] args) {
        test02();
        char c = (char) 20320;
        System.out.println("Unicode value 20320 corresponds to the character: " + c);
    }

    // JDK1.7以后的 try-with-resource
    // Add cache clause(s)
    public static void test02() {
        // try (定义资源的代码) : ()中的资源会自动释放
        try (FileInputStream fis = new FileInputStream("day09-io\\abc\\3.txt");
             FileOutputStream fos = new FileOutputStream("day09-io\\abc\\33.txt");) {
            // 可能有异常的代码
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("处理了文件找不到异常: " + e);
        } catch (IOException e) {
            System.out.println("处理了IO异常: " + e);
        }
    }

    // 学习使用try/catch/finaly释放资源
    public static void test01() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("day09-io\\abc\\3.txt");
            int b = fis.read();
            System.out.println("b = " + b);
        } catch (FileNotFoundException e) {
            System.out.println("处理了文件找不到异常: " + e);
        } catch (IOException e) {
            System.out.println("处理了IO异常: " + e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("处理了文件关闭异常: " + e);
                }
            }
        }
    }
}
