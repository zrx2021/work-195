package xuan.demo04Map常用方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo041 {
    public static void main(String[] args) {
        // 0.创建Map集合
        Map<String, String> map = new HashMap<>();
        // Map常用方法

        // 1.V put(K key, V value) 键不存在,添加键值对, 键存在是修改
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("黄晓明", "杨颖");
        String put1 = map.put("老干爹", "老干妈");
        System.out.println("put键不存在的返回值 = " + put1);// put添加时返回null

        System.out.println("put添加后 map" + map);// {邓超=孙俪, 老干爹=老干妈, 李晨=范冰冰, 黄晓明=杨颖}
        String put2 = map.put("李晨", "杨颖");
        System.out.println("put键存在的返回值 = " + put2);
        System.out.println("put修改后 map" + map);

        // 2.V get(Object key) 通过键获取值
        System.out.println(map.get("邓超"));// 孙俪
        System.out.println(map.get("马超"));// null

        // 3.V remove(Object key) 通过键删除这对数据
        map.remove("黄晓明");
        System.out.println("remove删除后 map =" + map);// {邓超=孙俪, 老干爹=老干妈, 李晨=杨颖}

        // 4.boolean containsKey(Object key) 判断集合是否包含指定的键
        System.out.println(map.containsKey("邓超"));// true
        System.out.println(map.containsKey("马超"));// false

        // 5.boolean containsValue(Object value) 判断集合是否包含指定的值
        System.out.println(map.containsValue("杨颖"));// true
        System.out.println(map.containsValue("迪丽热巴"));// false

        // 6.void clear() 清空数据
        // map.clear();
        System.out.println("clear后 = " + map);// {}

        // 7.int size() 获取集合的元素数量
        System.out.println("size() = " + map);

        // 8.boolean isEmpty() 判断集合是否为空
        System.out.println(map.isEmpty());

        // 9.keySet: 获取所有的键
        Set<String> keySet = map.keySet();
        System.out.println("strings = " + keySet);

        // 10.values: 获取所有的值
        Collection<String> values = map.values();// [邓超, 老干爹, 李晨]
        System.out.println("values = " + values);// [孙俪, 老干妈, 杨颖]
    }
}
