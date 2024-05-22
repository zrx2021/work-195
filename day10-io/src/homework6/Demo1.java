package homework6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("day10-io\\homework\\data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            System.out.println("IO异常");
        }

        System.out.println("请输入验证码：");
        String code = sc.next();
        if (list.contains(code)) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
    }
}
