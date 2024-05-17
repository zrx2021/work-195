package xuan.extendhomework4;

public class Demo1 {
    public static void main(String[] args) {
        String str = "Hello12345World6789012";
        System.out.println("替换后的字符串：" + str.replaceAll("\\d", "#"));
    }
}
