package homework1;

/**
 * 用户业务接口
 */
public interface UserService {
    // 登录功能
    void login(String loginName, String passWord) throws Exception;

    // 删除用户
    void deleteUsers() throws Exception;
}