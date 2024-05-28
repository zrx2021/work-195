package demo10动态代理练习;

import java.util.Random;

public class UserServiceImpl implements UserService {
    @Override
    public void login(String loginName, String password) throws Exception {
        Thread.sleep(new Random().nextInt(2000));
        if ("admin".equals(loginName) && "123456".equals(password)) {
            System.out.println("您登录成功，欢迎光临本系统~");
        } else {
            System.out.println("您登录失败，用户名或密码错误~");
        }
    }

    @Override
    public void deleteUsers() throws Exception {
        Thread.sleep(new Random().nextInt(2000));
        System.out.println("成功删除了1万个用户~");
    }

}
