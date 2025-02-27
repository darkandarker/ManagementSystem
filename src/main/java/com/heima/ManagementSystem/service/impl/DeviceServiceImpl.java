package com.heima.ManagementSystem.service.impl;

import com.heima.ManagementSystem.mapper.DeviceMapper;
import com.heima.ManagementSystem.pojo.Device;
import com.heima.ManagementSystem.pojo.PageBean;
import com.heima.ManagementSystem.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public void insert(Device device) {
        device.setCreateTime(LocalDateTime.now());
        device.setUpdateTime(LocalDateTime.now());
        device.setStatus((short) 0);
        deviceMapper.insert(device);
    }

    @Override
    public void delete(String deviceId) {
        deviceMapper.deleteByDeviceId(deviceId);
    }

    @Override
    public void update(Device device) {
        device.setUpdateTime(LocalDateTime.now());
        deviceMapper.update(device);
    }

    @Override
    public PageBean page(Integer page, Integer pageSize, String deviceId, Short status) {
        Long count = deviceMapper.count();

        Integer start = (page-1)*pageSize;
        List<Device> deviceList = deviceMapper.page(start,pageSize,deviceId,status);
        PageBean pageBean = new PageBean(count,deviceList);
        return pageBean;
    }



}
