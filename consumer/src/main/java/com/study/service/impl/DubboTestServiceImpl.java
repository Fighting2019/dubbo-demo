package com.study.service.impl;

import com.study.HelloService;
import com.study.service.DubboTestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author zyy
 * @description: todo
 */
@Service
public class DubboTestServiceImpl implements DubboTestService {

    @DubboReference(lazy = false,cluster = "forking",parameters = {"forks","4"})
    private HelloService helloService;


    @Override
    public String sayHi() {
        return helloService.sayHello();
    }
}
