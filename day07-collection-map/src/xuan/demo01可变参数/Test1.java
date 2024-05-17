package xuan.demo01可变参数;

// 定义一个方法可以接收任意个字符串, 在方法内部把这些字符串拼接成一个字符串并返回
public class Test1 {
    public static void main(String[] args) {
        System.out.println(combineString("a", "b"));
        System.out.println(combineString("a", "b", "c", "d"));
    }

    public static String combineString(String... str) {
        StringBuilder sb = new StringBuilder();

        for (String substr : str) {
            sb.append(substr);
        }

        return sb.toString();
    }
}
