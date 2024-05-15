package xuan.extendhomework;

public class Test1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = Pair.of("hello", 123);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
