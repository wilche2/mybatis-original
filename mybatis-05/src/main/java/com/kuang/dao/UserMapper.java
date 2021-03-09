package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author caoweiquan
 */
public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

}
