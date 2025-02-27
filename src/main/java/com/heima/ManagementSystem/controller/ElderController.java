package com.heima.ManagementSystem.controller;

import com.heima.ManagementSystem.service.ElderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElderController {
    @Autowired
    private ElderService elderService;


}
