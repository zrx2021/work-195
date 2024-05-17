package xuan.homework2;

import java.util.HashSet;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> balls = new HashSet<>();

        while (balls.size() != 7) {
            if (balls.size() <= 6) {
                balls.add(r.nextInt(33) + 1);
            }
        }

        int blue = r.nextInt(16) + 1;

        System.out.println("双色球：红球：" + balls + "，篮球：" + blue);
    }
}
