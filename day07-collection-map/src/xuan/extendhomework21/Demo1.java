package xuan.extendhomework21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, String>> map = new HashMap<>();

        HashMap<String, String> students1 = new HashMap<>();
        HashMap<String, String> students2 = new HashMap<>();

        students1.put("001", "李晨");
        students1.put("002", "范冰冰");
        students2.put("001", "马云");
        students2.put("002", "马化腾");

        map.put("Java基础班", students1);
        map.put("Java就业班", students2);

        HashMap<String, String> classBase = map.get("Java基础班");
        HashMap<String, String> classWork = map.get("Java就业班");

        Set<String> base = classBase.keySet();
        for (String s : base) {
            System.out.println("学号：" + s + "，姓名：" + classBase.get(s));
        }

        Set<Map.Entry<String, String>> work = classWork.entrySet();
        for (Map.Entry<String, String> s : work) {
            System.out.println("学号：" + s + "，姓名：" + classWork.get(s));
        }
    }
}
