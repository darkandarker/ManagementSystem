package com.heima.ManagementSystem.service;

import com.heima.ManagementSystem.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminService {


    Admin login(Admin admin);

    void register(Admin admin);

    List<Admin> list();

    void delete(String username);
}
