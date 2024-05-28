package homework1;

import java.util.Random;

/**
 * 用户业务实现类
 */
public class UserServiceImpl implements UserService {
    @Override
    public void login(String loginName, String password) throws Exception {
        if ("admin".equals(loginName) && "123456".equals(password)) {
            System.out.println("您登录成功，欢迎光临本系统~");
        } else {
            System.out.println("您登录失败，用户名或密码错误~");
        }
        Thread.sleep(new Random().nextInt(2000));
    }

    @Override
    public void deleteUsers() throws Exception {
        System.out.println("成功删除了1万个用户~");
        Thread.sleep(new Random().nextInt(2000));
    }
}