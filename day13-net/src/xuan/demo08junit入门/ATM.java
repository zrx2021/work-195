package xuan.demo08junit入门;

/**
 * 用户业务实现类
 */
public class ATM {
    public boolean login(String loginName, String password) {
        // 我是注释
        boolean success = "admin2".equals(loginName) && "123456".equals(password);

        if (success) {
            System.out.println("您登录成功，欢迎光临本系统~");
        } else {
            System.out.println("您登录失败，用户名或密码错误~");
        }

        return success;
    }

    public boolean deleteUsers() {
        System.out.println("成功删除了1万个用户~");
        return true;
    }

    public String[] selectUsers() {
        System.out.println("查询出了3个用户");
        String[] names = {"张全蛋", "李二狗", "牛爱花"};
        return names;
    }
}
