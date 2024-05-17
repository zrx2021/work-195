package xuan.demo10正则表达式介绍;

/*
    需求: 定义一个方法实现判断一个手机号码是否正确
        1.长度为11
        2.首位为1
        3.第二位是3-9
        4.后面都是0-9的数字
 */
public class Demo06 {
    public static void main(String[] args) {
        System.out.println(checkPhoneNumber2("13700001111"));
        System.out.println(checkPhoneNumber2("1370000111"));
        System.out.println(checkPhoneNumber2("03700001111"));
    }

    // 体验正则表达式匹配手机号
    public static boolean checkPhoneNumber2(String phoneNumber) {
        return phoneNumber.matches("1[3-9][0-9]{9}");
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }

        if (!phoneNumber.startsWith("1")) {
            return false;
        }

        char ch = phoneNumber.charAt(1);
        if (!(ch >= '3' && ch <= '9')) {
            return false;
        }

        for (int i = 2; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        return true;
    }
}