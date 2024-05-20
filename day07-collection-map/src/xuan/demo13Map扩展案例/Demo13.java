package xuan.demo13Map扩展案例;

import java.util.HashMap;
import java.util.Map;

public class Demo13 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("游戏电视", "https://search.jd.com/Search?keyword=%E6%B8%B8%E6%88%8F%E7%94%B5%E8%A7%86&enc=utf-8&pvid=e545803ffab3460aaf6194c85bdc8b10");
        map.put("笔记本", "https://list.jd.com/list.html?cat=670,671,672");
        map.put("牛仔裤", "https://list.jd.com/list.html?cat=1315,1342,9735");

        // 遍历Map
        map.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
