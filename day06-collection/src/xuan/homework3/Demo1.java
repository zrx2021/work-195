package xuan.homework3;

import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set<Phone> phones = new TreeSet<>((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));

        phones.add(new Phone("小米13", 3999));
        phones.add(new Phone("华为P50", 5999));
        phones.add(new Phone("iPhone14", 8999));

        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
