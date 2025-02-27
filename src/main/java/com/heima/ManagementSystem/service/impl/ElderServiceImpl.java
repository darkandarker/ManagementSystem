package com.heima.ManagementSystem.service.impl;

import com.heima.ManagementSystem.mapper.ElderMapper;
import com.heima.ManagementSystem.service.ElderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElderServiceImpl implements ElderService {
    @Autowired
    private ElderMapper elderMapper;
}
