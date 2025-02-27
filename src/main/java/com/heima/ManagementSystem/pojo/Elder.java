package com.heima.ManagementSystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Elder {
    private Integer id;
    private String name;
    private Short gender;
    private LocalDate bornDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
