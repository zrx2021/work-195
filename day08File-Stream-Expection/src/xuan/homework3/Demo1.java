package xuan.homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(11) + 10);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.stream().filter(ints -> ints > 15).forEach(s -> System.out.print(s + " "));
    }
}
