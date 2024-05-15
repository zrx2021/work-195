package xuan.demo09LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDateTime;

/*
假设你的出生日期是 2001-05-29 13:25:32, 你女朋友的出生日期是 2002-11-08 09:10:55, 请用程序比较谁更大
    使用LocalDateTime的of方法
    isBefore或isAfter
 */
public class Test1 {
    public static void main(String[] args) {
        LocalDateTime myBirthday = LocalDateTime.of(2001, 5, 29, 13, 25, 32);
        LocalDateTime girlFriendBirthday = LocalDateTime.of(2002, 11, 8, 9, 10, 55);
        if (myBirthday.isBefore(girlFriendBirthday)) {
            System.out.println("我比女朋友大");
        } else if (myBirthday.isAfter(girlFriendBirthday)){
            System.out.println("我比女朋友小");
        } else {
            System.out.println("你和女朋友的生日相同");
        }
    }
}
