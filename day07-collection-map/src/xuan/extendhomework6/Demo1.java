package xuan.extendhomework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 33, 11, 77, 55);
        Collections.sort(list);

        System.out.println(list);
    }
}
