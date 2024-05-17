package xuan.demo08Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    统计 "ab7c5SD3RaQx" 中大写字母, 小写字母, 数字 的数量, 效果如下: {小写字母=5, 数字=3, 大写字母=4}
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "ab7c5SD3RaQx";

        Map<String, String> chars = new HashMap<>();

        chars.put("小写字母", "[a-z]");
        chars.put("数字", "[0-9]");
        chars.put("大写字母", "[A-Z]");

        Map<String, Integer> countMap = new HashMap<>();

        chars.forEach((item, regex) -> {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                if (!countMap.containsKey(item)) {
                    countMap.put(item, 1);
                } else {
                    Integer count = countMap.get(item);
                    countMap.put(item, count + 1);
                }
            }
        });

        countMap.forEach((item, count) -> {
            System.out.println(item + " == " + count);
        });
    }
}
