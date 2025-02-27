package com.heima.ManagementSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String deviceId;
    private String elderId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
