package xuan.demo10ZoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/*
目标: 了解时区和带时区的时间


 */
public class Demo10 {
    public static void main(String[] args) {
        // ZoneId时区的使用
        // 1.getAvailableZoneIds(): 获取Java支持的全部时区Id
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("zoneIds = " + zoneIds);

        // 2.systemDefault(): 获取系统默认的时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("系统默认时区: " + zoneId); // Asia/Shanghai

        // 3.of(String zoneId) 获取一个指定时区
        ZoneId zoneOf = ZoneId.of("America/New_York");
        System.out.println("zoneOf = " + zoneOf);

        // ZonedDateTime带时区的时间的使用
        // 4.now(): 获取当前时区的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);

        // 5.now(ZoneId zone): 获取指定时区的ZonedDateTime对象
        ZonedDateTime of = ZonedDateTime.now(zoneOf);
        System.out.println("of = " + of);
    }
}
