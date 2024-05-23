package xuan.homework5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 根据配置文件保存到：F:/log/itheima-data.log
public class LogTest {
    public static final Logger LOGGER = LoggerFactory.getLogger("LogTest");
    public static void main(String[] args) {
        int x = getMoney(666666, 123456, 100);
        LOGGER.info("拿取款的钱去买皮肤: " + x);
    }

    // 方法中不确定\会变化的数据就定义为参数
    // 把方法运算的结果给到调用的地方去处理
    public static int getMoney(int account, int password, int money) {
        LOGGER.info("尊贵的客户准备取款");
        LOGGER.info("账号减" + money);
        LOGGER.info("取款机夸啦啦啦");

        return money;
    }
}