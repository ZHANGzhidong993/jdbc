package service;

import pojo.User;

import java.util.List;

/**
 * @author zhangzhidong
 * @create: 2019-02-17 22:25
 */
public interface UserService {

    void save(User user);

    List<User> getUsers();
}
