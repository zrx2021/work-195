package xuan.extendhomework20;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String[] strings1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] strings2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings1.length; i++) {
            map.put(strings1[i], strings2[i]);
        }

        System.out.println(map);
    }
}
