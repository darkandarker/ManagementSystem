package com.heima.ManagementSystem.service;

import com.heima.ManagementSystem.pojo.User;

public interface UserService {
    User login(User user);

    void register(User user);
}
