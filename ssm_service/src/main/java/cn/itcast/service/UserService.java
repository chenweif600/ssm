package cn.itcast.service;

import cn.itcast.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryUserList();

    void deleteUserById(Long id);
}
