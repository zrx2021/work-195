package xuan.extendhomework2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = "192.168.105.27";
        String str2 = "18  22  40  65";
        String[] splitStr1 = str1.split("\\.");
        String[] splitStr2 = str2.split("\\s+");

        System.out.println(Arrays.toString(splitStr1));
        System.out.println(Arrays.toString(splitStr2));
    }
}
