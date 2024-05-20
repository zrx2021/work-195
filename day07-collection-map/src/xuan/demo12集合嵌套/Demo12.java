package xuan.demo12集合嵌套;

import java.util.*;

/*
目标:使用Map嵌套

   要求在程序中记住如下省份和其对应的城市信息，记录成功后，要求遍历出所有省份的所有城市信息
       "江苏省" = "南京市", "扬州市", "苏州市", "无锡市", "常州市"
       "湖北省" = "武汉市", "襄阳市", "荆州市", "鄂州市", "黄冈市", "孝感市"
       "河北省" = "石家庄市", "唐山市", "邢台市", "保定市", "张家口市"
*/
public class Demo12 {
    public static void main(String[] args) {
        // 1.使用ArrayList保存城市信息
        List<String> jss = new ArrayList<>();
        Collections.addAll(jss, "南京市", "扬州市", "苏州市", "无锡市", "常州市");

        List<String> hubs = new ArrayList<>();
        Collections.addAll(hubs, "武汉市", "襄阳市", "荆州市", "鄂州市", "黄冈市", "孝感市");

        List<String> hebs = new ArrayList<>();
        Collections.addAll(hebs, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        // 2.使用Map集合保存省份和对应的城市
        Map<String, List<String>> map = new HashMap<>();
        map.put("江苏省", jss);
        map.put("湖北省", hubs);
        map.put("河北省", hebs);

        // 3.遍历集合
        map.forEach((k, v) -> {
            // k: 键, 省份
            // v: 值, 城市集合
            System.out.println(k);
            // 遍历值, 城市集合
            for (String city : v) {
                System.out.println("\t" + city);
            }
        });

        System.out.println("----------------");
        // 使用键找值方式遍历
        Set<String> keySet = map.keySet();
        // 遍历获取每个就爱你
        for (String key : keySet) {
            System.out.println(key);
            // 通过键获取值
            List<String> value = map.get(key);
            // 值是List集合, 使用增强for遍历
            for (String city : value) {
                System.out.println("\t" + city);
            }
        }

        System.out.println("----------------");
        // 使用键值对方式遍历
        // 获取所有的键值对
        Set<Map.Entry<String, List<String>>> entrySet = map.entrySet();
        // 遍历获取每个Entry
        for (Map.Entry<String, List<String>> entry : entrySet) {
            // 通过Entry获取key
            String key = entry.getKey();
            System.out.println(key);
            // 通过Entry获取value
            List<String> value = entry.getValue();
            // 值是List集合, 使用增强for遍历
            for (String city : value) {
                System.out.println("\t" + city);
            }
        }
    }
}
