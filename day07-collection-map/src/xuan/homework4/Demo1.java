package xuan.homework4;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> users = new HashMap<>();

        Map<String, Integer> cart1 = new HashMap<>();
        Map<String, Integer> cart2 = new HashMap<>();
        Map<String, Integer> cart3 = new HashMap<>();

        cart1.put("Java入门到精通", 3);
        cart1.put("联想y9000p电脑", 1);
        cart1.put("华强北苹果耳机pro6", 1);

        cart2.put("宜家凳子", 2);
        cart2.put("华为P50", 3);
        cart2.put("康师傅方便面", 5);

        cart3.put("安踏运动鞋", 2);
        cart3.put("优衣库毛衣", 1);
        cart3.put("雷蛇鼠标", 3);

        users.put("景甜", cart1);
        users.put("赵丽颖", cart2);
        users.put("杨幂", cart3);

        users.forEach((k1, v1) -> {
            System.out.println(k1 + "用户的购物车信息如下:");
            v1.forEach((k2, v2) -> {
                System.out.println("\t商品名称:" + k2 + ", 商品数量: " + v2);
            });
        });
    }
}
