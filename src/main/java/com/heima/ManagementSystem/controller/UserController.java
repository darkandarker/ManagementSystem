package com.heima.ManagementSystem.controller;

import com.heima.ManagementSystem.pojo.Admin;
import com.heima.ManagementSystem.pojo.Result;
import com.heima.ManagementSystem.pojo.User;
import com.heima.ManagementSystem.service.UserService;
import com.heima.ManagementSystem.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user/login")
    public Result login(@RequestBody User user){
        User u = userService.login(user);

        if(u != null){
            Map<String,Object> claims = new HashMap<>();
            claims.put("id",u.getId());
            claims.put("username",u.getUsername());
            claims.put("name",u.getPassword());

            String jwt = JwtUtils.generateJwt(claims);
            return Result.success(jwt);
        }

        return Result.error("用户名或密码错误");
    }
    @PostMapping("/user/register")
    public Result register(@RequestBody User user){
        userService.register(user);
        return Result.success();
    }
}
