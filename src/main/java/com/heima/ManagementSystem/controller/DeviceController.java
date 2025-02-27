package com.heima.ManagementSystem.controller;

import com.heima.ManagementSystem.pojo.Device;
import com.heima.ManagementSystem.pojo.PageBean;
import com.heima.ManagementSystem.pojo.Result;
import com.heima.ManagementSystem.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    @PostMapping("/dev")
    public Result insert(@RequestBody Device device){
        deviceService.insert(device);
        return Result.success();
    }

    @DeleteMapping("/dev/{device_id}")
    public Result delete(@PathVariable String device_id){
        deviceService.delete(device_id);
        return Result.success();
    }

    @PutMapping("/dev")
    public Result update(@RequestBody Device device){
        deviceService.update(device);
        return Result.success();
    }

    @GetMapping("/dev")
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String deviceId,
                       Short status){
        PageBean pageBean = deviceService.page(page,pageSize, deviceId,status);
        return Result.success(pageBean);
    }



}
