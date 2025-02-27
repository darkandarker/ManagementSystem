package com.heima.ManagementSystem.service;

import com.heima.ManagementSystem.pojo.Device;
import com.heima.ManagementSystem.pojo.PageBean;

public interface DeviceService {

    void insert(Device device);

    void delete(String deviceId);

    void update(Device device);

    PageBean page(Integer page, Integer pageSize, String deviceId, Short status);
}
