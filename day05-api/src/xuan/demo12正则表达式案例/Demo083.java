package xuan.demo12正则表达式案例;

/*
    String的split方法中使用正则表达式
    String类的replaceAll方法中使用正则表达式
 */
public class Demo083 {
    public static void main(String[] args) {
        String message = "我真的很不爽，操,今天被程序bug搞了一整天，妈逼简直要炸了煤气罐。结果晚上去网吧打游戏，结果被一个叫“煞笔科技”的公司的广告弹窗给搞崩了，我就想骂人，草！";
        System.out.println(message.replaceAll("[操草]|(妈逼)|(煞笔)", "*"));
    }
}
