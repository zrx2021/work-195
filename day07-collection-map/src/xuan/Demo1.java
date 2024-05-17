package xuan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> provinces = new HashMap<>();

        ArrayList<String> jiangsu = new ArrayList<>();
        ArrayList<String> hubei = new ArrayList<>();
        ArrayList<String> hebei = new ArrayList<>();

        Collections.addAll(jiangsu, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        Collections.addAll(hubei, "武汉市", "襄阳市", "荆州市", "鄂州市", "黄冈市", "孝感市");
        Collections.addAll(hebei, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");

        provinces.put("江苏省", jiangsu);
        provinces.put("湖北省", hubei);
        provinces.put("河北省", hebei);

        provinces.forEach((province, cities) -> {
            System.out.println(province);
            for (String city : cities) {
                System.out.println("\t" + city);
            }
        });
    }
}
