package xuan.homework1;

import java.util.Random;

public class MyThread extends Thread {
    @Override
    public void run() {
        Random r = new Random();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += r.nextInt(901) + 100;
        }

        System.out.println("sum = " + sum);
    }
}
