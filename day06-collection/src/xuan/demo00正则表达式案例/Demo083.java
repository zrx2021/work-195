package xuan.demo00正则表达式案例;

/*
    String的split方法中使用正则表达式
    String类的replaceAll方法中使用正则表达式
 */
public class Demo083 {
    public static void main(String[] args) {
        // String的split方法中使用正则表达式
        String names = "贾乃亮,,陈羽凡,,,,王宝强,谢霆锋";
        // 使用 一个以上的,进行切割
        String[] split = names.split(",+");
        for (int i = 0; i < split.length; i++) {
            String str = split[i];
            System.out.println("str = " + str);
        }

        System.out.println("----------------");
        // String类的replaceAll方法中使用正则表达式
        String str = "我是渣渣辉,是兄弟就来砍我,渣渣辉操起一把屠龙刀,一刀999!";
        String newStr = str.replaceAll("[渣砍操]", "*");
        System.out.println("脏话过滤后 newStr = " + newStr);
    }
}
