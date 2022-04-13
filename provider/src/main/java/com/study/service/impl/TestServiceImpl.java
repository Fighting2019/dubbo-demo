package com.study.service.impl;

import com.study.HelloService;
import com.study.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author zyy
 * @description: todo
 */
@Service
public class TestServiceImpl implements TestService {
    @DubboReference(mock = "force")
    private HelloService helloService;


    @Override
    public String dubboHello() {
        return helloService.sayHello();
    }
}
