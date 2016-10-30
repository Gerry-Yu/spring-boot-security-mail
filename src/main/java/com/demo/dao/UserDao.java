package com.demo.dao;

import com.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Pinggang Yu on 2016/10/28.
 */
@Mapper
public interface UserDao {

    @Results(id = "userMap", value = {
            @Result(property = "id", column = "userId",id = true),
            @Result(property = "name", column = "username")
    })
    @Select("select * from user where userId = #{id}")
    User getUserById(int id);

    @Select("select * from user")
    @ResultMap("userMapXML")
    List<User> getAllUsers();
}
