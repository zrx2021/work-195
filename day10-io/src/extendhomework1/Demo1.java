package extendhomework1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String line = sc.nextLine();

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10-io\\homework\\scanconsoletofile.txt"))) {
            bos.write(line.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("文件找不到异常");
        } catch (IOException e) {
            System.out.println("文件IO异常");
        }
    }
}
