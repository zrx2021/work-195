package xuan.demo00正则表达式案例;

public class Test06 {
    public static void main(String[] args) {
        String message = "我真的很不爽，操,今天被程序bug搞了一整天，妈逼简直要炸了煤气罐。结果晚上去网吧打游戏，结果被一个叫“煞笔科技”的公司的广告弹窗给搞崩了，我就想骂人，草！";
        // String newMessage = message.replaceAll("[操妈逼煞笔草]", "*"); // 我真的很不爽，*,今天被程序bug搞了一整天，**简直要炸了煤气罐。结果晚上去网吧打游戏，结果被一个叫“**科技”的公司的广告弹窗给搞崩了，我就想骂人，*！
        String newMessage = message.replaceAll("[操草]|(妈逼)|(煞笔)", "*"); // 我真的很不爽，*,今天被程序bug搞了一整天，*简直要炸了煤气罐。结果晚上去网吧打游戏，结果被一个叫“*科技”的公司的广告弹窗给搞崩了，我就想骂人，*！
        System.out.println("newMessage = " + newMessage);
    }
}