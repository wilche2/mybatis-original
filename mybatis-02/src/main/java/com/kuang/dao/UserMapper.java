package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author caoweiquan
 */
public interface UserMapper {

    List<User> selectUser();

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
