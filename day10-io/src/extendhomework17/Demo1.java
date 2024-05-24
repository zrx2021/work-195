package extendhomework17;

import java.io.*;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        File file = new File("day10-io\\homework\\save.txt");
        Student stu;

        if (!file.exists()) {
            stu = scanInfo();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(stu);
            } catch (FileNotFoundException e) {
                System.out.println("文件找不到异常");
            } catch (IOException e) {
                System.out.println("文件IO异常");
            }
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                Object obj = ois.readObject();
                stu = ((Student) obj);
                System.out.println("学号  姓名 省份证号  Java成绩  数学成绩  英语成绩");

                String number = stu.getNumber();
                String name = stu.getName();
                String identity = stu.getIdentity();
                double javaScore = stu.getJavaScore();
                double mathScore = stu.getMathScore();
                double englishScore = stu.getEnglishScore();

                System.out.println(number + "\t" + name + "\t" + identity + "\t" + javaScore + "\t" + mathScore + "\t" + englishScore);
            } catch (FileNotFoundException e) {
                System.out.println("文件找不到异常");
            } catch (IOException e) {
                System.out.println("文件IO异常");
            } catch (ClassNotFoundException e) {
                System.out.println("找不到类异常");
            }
        }
    }

    public static Student scanInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** 录入学生信息 *****");
        System.out.println("请输入学号：");
        String number = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入身份证号：");
        String identity = sc.next();
        System.out.println("请输入Java成绩：");
        String javaScore = sc.next();
        System.out.println("请输入数学成绩：");
        String mathScore = sc.next();
        System.out.println("请输入英语成绩：");
        String englishScore = sc.next();
        return new Student(number, name, identity, Integer.parseInt(javaScore), Integer.parseInt(mathScore), Integer.parseInt(mathScore));
    }
}
