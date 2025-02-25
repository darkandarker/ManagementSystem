package com.heima.ManagementSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
