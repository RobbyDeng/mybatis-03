package com.dyr.dao;

import com.dyr.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.junit.Test;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    //当有多个参数时，每一个参数前都要加上@Param
    @Select("select * from user where id =#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    int addUser(User user);

    @Insert("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);

}