package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author caoweiquan
 */
public interface UserMapper {

    List<User> selectUser();

    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    int addUser2(Map<String, Object> map);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserLikeName(String name);
}
