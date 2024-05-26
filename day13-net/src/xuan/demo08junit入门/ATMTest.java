package xuan.demo08junit入门;

import org.junit.*;

import java.util.Arrays;

// 1.定义测试类
/*
单元测试方法要求:
    1.修饰符必须是public
    2.返回值类型必须是void
    3.建议是无参数


单元测试其他注解:
    @BeforeClass：所有测试方法前执行一次
    @AfterClass：所有测试方法后执行一次
    @Before：每个测试方法前执行一次
    @After：每个测试方法后执行一次

断言
    你觉得
 */
public class ATMTest {
    private ATM atm;

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("testBeforeClass");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("testAfterClass");
    }

    @Before
    public void testBefore() {
        System.out.println("testBefore");
        atm = new ATM();
    }

    @After
    public void testAfter() {
        System.out.println("testAfter");
        atm = null;
    }

    // 2.定义测试方法, 添加@Test注解
    @Test
    public void testLogin() {
        ATM atm = new ATM();

        // 模拟错误
        // int a = 10 / 0;

        // 测试ATM的login方法
        boolean result = atm.login("admin", "123456");

        // 断言，断言正确没有任何提示
        // Assert.assertTrue("结果应该为true", result);

        // assertEquals(消息, 你预期的结果, 真实的结果)
        Assert.assertEquals("登录的结果应该为true", true, result);

        System.out.println("result = " + result);
    }

    @Test
    public void testDeleteUser() {
        // ATM atm = new ATM();

        // 测试ATM的deleteUsers方法
        boolean result = atm.deleteUsers();
        System.out.println("result = " + result);
    }

    @Test
    public void testSelectUser() {
        ATM atm = new ATM();

        // 测试ATM的testSelectUser方法
        String[] users = atm.selectUsers();
        System.out.println(Arrays.toString(users));
    }
}
