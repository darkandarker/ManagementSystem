package com.heima.ManagementSystem.service;

import com.heima.ManagementSystem.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminService {


    Admin login(Admin admin);

    void register(Admin admin);
}
