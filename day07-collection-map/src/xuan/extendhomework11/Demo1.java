package xuan.extendhomework11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = add("a", "b", "c");

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> add(String... strings) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, strings);

        return list;
    }
}
