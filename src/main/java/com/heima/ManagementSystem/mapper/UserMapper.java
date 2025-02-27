package com.heima.ManagementSystem.mapper;

import com.heima.ManagementSystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{user.username} and password = #{user.password}")
    User getByUsernameAndPassword(@Param("user") User user);
}
