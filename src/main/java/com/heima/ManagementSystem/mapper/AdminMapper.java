package com.heima.ManagementSystem.mapper;

import com.heima.ManagementSystem.pojo.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("select * from admin where username = #{admin.username} and password = #{admin.password}")
    Admin getByUsernameAndPassword(@Param("admin") Admin admin);
    @Insert("insert into admin (username,password,name,create_time,update_time) values (#{admin.username},#{admin.password},#{admin.name},#{admin.createTime},#{admin.updateTime})")
    void save(@Param("admin") Admin admin);
    @Select("select * from admin")
    List<Admin> list();
    @Delete("delete from admin where username = #{username}")
    void delete(@Param("username") String username);
}
