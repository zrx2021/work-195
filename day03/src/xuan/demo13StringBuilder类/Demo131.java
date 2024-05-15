package xuan.demo13StringBuilder类;

public class Demo131 {
    public static void main(String[] args) {
        // 1.创建StringBuilder
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("sb = " + sb);

        sb.append(123).append('好').append(6.66).append("很好");
        System.out.println("sb2 = " + sb);

        sb.reverse();
        System.out.println("反转后sb3" + sb);

        System.out.println("长度：" + sb.length());

        String str = sb.toString();
        System.out.println("str = " + str);
    }
}
