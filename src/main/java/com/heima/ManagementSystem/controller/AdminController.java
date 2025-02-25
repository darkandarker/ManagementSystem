package com.heima.ManagementSystem.controller;

import com.heima.ManagementSystem.pojo.Admin;
import com.heima.ManagementSystem.pojo.Result;
import com.heima.ManagementSystem.service.AdminService;
import com.heima.ManagementSystem.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping("/login")
    public Result login(@RequestBody Admin admin){
        Admin a = adminService.login(admin);

        if(a != null){
            Map<String,Object> claims = new HashMap<>();
            claims.put("id",a.getId());
            claims.put("name",a.getName());
            claims.put("username",a.getUsername());

            String jwt = JwtUtils.generateJwt(claims);
            return Result.success(jwt);
        }

        return Result.error("用户名或密码错误");
    }
    @PostMapping("/register")
    public Result register(@RequestBody Admin admin){
        adminService.register(admin);
        return Result.success();
    }
}
