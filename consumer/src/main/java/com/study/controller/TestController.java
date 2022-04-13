package com.study.controller;

import com.study.service.DubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyy
 * @description: todo
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DubboTestService testService;

    @RequestMapping("/sayHi")
    public String sayHi(){
        return testService.sayHi();
    }
}
