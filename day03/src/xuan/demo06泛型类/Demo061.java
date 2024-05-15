package xuan.demo06泛型类;

/*
    1.定义泛型变量：<E>
    2.使用泛型变量：E
    3.创建对象时，给泛型变量赋值
 */
public class Demo061 {
    public static void main(String[] args) {
        MyArrayList<String> list1 = new MyArrayList<>();
        list1.add("123");
        String s = list1.get(0);

        MyArrayList<Number> list2 = new MyArrayList<>();
        // list2.add(Number e);
        // Number n = list2.get(0);
    }
}
