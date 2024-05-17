package xuan.regex;

public class Demo1 {
    public static void main(String[] args) {
        String str = "我真的很不爽，操,今天被程序bug搞了一整天，妈逼简直要炸了煤气罐。结果晚上去网吧打游戏，结果被一个叫“煞笔科技”的公司的广告弹窗给搞崩了，我就想骂人，草！";
        String finalString = str.replaceAll("(操)+|(草)+|(妈逼)+|(煞笔)+", "*");
        System.out.println(finalString);
    }
}
