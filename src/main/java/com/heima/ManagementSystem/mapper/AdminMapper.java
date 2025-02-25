package com.heima.ManagementSystem.mapper;

import com.heima.ManagementSystem.pojo.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AdminMapper {

    @Select("select * from admin where username = #{admin.username} and password = #{admin.password}")
    Admin getByUsernameAndPassword(@Param("admin") Admin admin);
    @Insert("insert into admin (username,password,name,create_time,update_time) values (#{admin.username},#{admin.password},#{admin.name},#{admin.createTime},#{admin.updateTime})")
    void save(@Param("admin") Admin admin);
}
