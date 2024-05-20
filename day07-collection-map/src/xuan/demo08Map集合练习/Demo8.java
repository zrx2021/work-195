package xuan.demo08Map集合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
目标:Map集合的案例-统计投票人数
需求
    某个班级8名学生，现在需要组织秋游活动，提供了四个景点依次是（玉龙雪山、大理、漓江、泰山、泰国）,每个学生只能选择一个景点，
    最终学生选择结果为[玉龙雪山、泰国、泰国、泰国、大理、大理、泰山、漓江]，请统计出最终哪个景点想去的人数最多。
    效果: {泰国=3, 漓江=1, 大理=2, 玉龙雪山=1, 泰山=1}
 */
public class Demo8 {
    public static void main(String[] args) {
        // 1.把学生选择的景点保存到List集合中
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "玉龙雪山", "泰国", "泰国", "泰国", "大理", "大理", "泰山", "漓江");

        HashMap<String, Integer> selectedCount = new HashMap<>();

        for (String s : list) {
            if (!selectedCount.containsKey(s)) {
                selectedCount.put(s, 1);
            } else {
                Integer integer = selectedCount.get(s);
                selectedCount.put(s, integer + 1);
            }
        }

        selectedCount.forEach((s, integer) -> {
            System.out.println(s + " == " + integer);
        });
    }
}
