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

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    /**
     * 分页
     */
    List<User> getUserByLimit(Map<String, Integer> map);

    /**
     * 分页2
     *
     * @return
     */
    List<User> getUserByRowBounds();

}
