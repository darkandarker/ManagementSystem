package com.heima.ManagementSystem.service.impl;

import com.heima.ManagementSystem.mapper.UserMapper;
import com.heima.ManagementSystem.pojo.User;
import com.heima.ManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.getByUsernameAndPassword(user);
    }

    @Override
    public void register(User user) {
        //这里应该要先添加elder，获取elder的id后再进行用户的注册
    }
}
