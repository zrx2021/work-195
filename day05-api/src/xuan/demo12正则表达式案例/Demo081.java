package xuan.demo12正则表达式案例;

public class Demo081 {
    public static void main(String[] args) {
        System.out.println(checkTime("20200810")); // true
        System.out.println(checkTime("2020-08-10")); // true
        System.out.println(checkTime("2020-08-31")); // true
        System.out.println(checkTime("2020-08-41")); // false
        System.out.println(checkTime("2020-00-21")); // false

        System.out.println("------------------------------------");
        System.out.println(checkEmail("326370094@qq.com")); // true
        System.out.println(checkEmail("326370094@qq.com.cn")); // true
        System.out.println(checkEmail("326370094@qq1234.com.cn")); // true
        System.out.println(checkEmail("326370094中@qq14.com.cn")); // false
        System.out.println(checkEmail("326370094@qq14")); // false
        System.out.println(checkEmail("326370094@qq14.com.com.com")); // false

        System.out.println("------------------------------------");
        System.out.println(checkPhone("13812345678")); // true
        System.out.println(checkPhone("1381234567")); // false
        System.out.println(checkPhone("010-98951256")); // true
        System.out.println(checkPhone("010-08951256")); // false
        System.out.println(checkPhone("01098951256")); // true
        System.out.println(checkPhone("400-618-9090")); // true
        System.out.println(checkPhone("400-618-90900")); // false
        System.out.println(checkPhone("4006189090")); // true
        System.out.println("-------------------------");
        System.out.println(checkPhone("400-6189090")); // true
    }

    /*
        定义方法使用正则表达式判断是否是电话
        电话包含：手机 或 座机 或 热线电话
              手机规则：首位为1，中间是[3-9]的数字，后面9个都是数字    13812345678
              座机规则： 前面三个数字是区号(第一个是0后面2个数字可以是0-9之间的数字)，中间可以有横杠(-)也可以没有，最后就是八个数字(第一不是0)     010-98951256
              热线电话规则：前面三个数字就是400，可以有横杠，也可以没有(-)，再来三个数字，可以有横杠，也可以没有(-),最后再来4个数字    400-618-9090 | 4006189090
     */
    public static boolean checkPhone(String number) {
        // number.matches("(1[3-9]\\d{9})|(0\\d{2}-?[1-9]\\d{7})|(400-?\\d{3}-?\\d{4})");
        return number.matches("(1[3-9]\\d{9})|(0\\d{2}-?[1-9]\\d{7})|(400-?\\d{3}-?\\d{4})");
    }

    /*
        定义方法使用正则表达式判断是否是邮箱
        邮箱规则： 用户名@域名 两部分组成，中间用@符号连接
            用户名由：字母、数字、下划线_ 组成, 最少5位
            域名由：至少1位字母或数字(.2到4位字母)出现1次或2次

            3456789@qq.com
            john_doe@hotmail.com
            john_doe@hotmail.com.cn
     */
    public static boolean checkEmail(String email) {
        email.matches("\\w{5,}@([a-zA-Z0-9]{2,4}){1,2}");
        return false;
    }

    /*
        定义方法使用正则表达式判断是否是时间
        时间规则：
            年-月-日
            年份 第一位1到9中的一个,最多四位
            中间可以有横杠也可以没有，
            月份[以0开始，后面的数字只能是1-9，如果是以1开头 第二个数字只能是 0 1 2 ]
            中间可以有横杠也可以没有，
            日[0开头后面只能是[1-9], 1或2开头后面数字可以是[0-9], 3开头后面数字可以是0或1]
            20230831
            2023-08-31
     */
    public static boolean checkTime(String time) {
        return time.matches("[1-9]\\d{3}-?(0[1-9]|1[012])-?(0[1-9]|[12][0-9]|3[01])");
    }
}