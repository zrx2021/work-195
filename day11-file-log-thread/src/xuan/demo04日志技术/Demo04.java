package xuan.demo04日志技术;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
目标: 使用Logback日志框架记录日志
 */
public class Demo04 {
    // 2.创建日志对象   org.slf4j
    public static final Logger LOGGER = LoggerFactory.getLogger("Demo04");

    public static void main(String[] args) {
        divide(10, 2);
    }

    public static void divide(int a, int b) {
        // 3.使用日志对象记录日志, {}: 表示占位符, 使用后面的数据替换
        LOGGER.debug("进入divide方法 a = {}, b = {}", a, b);

        try {
            LOGGER.info("除法前");
            int c = a / b;
            LOGGER.warn("除法后, c = {}", c);
        } catch (Exception e) {
            LOGGER.error("除数不能为0！！！");
        }
    }
}
