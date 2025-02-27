package com.heima.ManagementSystem.service.impl;

import com.heima.ManagementSystem.mapper.AdminMapper;
import com.heima.ManagementSystem.pojo.Admin;
import com.heima.ManagementSystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.getByUsernameAndPassword(admin);
    }

    @Override
    public void register(Admin admin) {
        admin.setCreateTime(LocalDateTime.now());
        admin.setUpdateTime(LocalDateTime.now());
        adminMapper.save(admin);
    }

    @Override
    public List<Admin> list() {
        return adminMapper.list();
    }

    @Override
    public void delete(String username) {
        adminMapper.delete(username);
    }
}
