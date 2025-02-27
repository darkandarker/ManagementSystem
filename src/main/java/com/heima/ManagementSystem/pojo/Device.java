package com.heima.ManagementSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    private Integer id;
    private String deviceId;
    private Short status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
