package com.study.controller;

import com.study.HelloService;
import com.study.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zyy
 * @description: 测试类
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private TestService testService;

    @RequestMapping("/sayHello")
    public String helloWorld(){
        return "hello world";
    }

    @RequestMapping("helloDubbo")
    public String helloDubbo(){
        return testService.dubboHello();
    }
}
