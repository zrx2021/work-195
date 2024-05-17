package xuan.extendhomework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(33);
        list.add(55);
        list.add(77);

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
