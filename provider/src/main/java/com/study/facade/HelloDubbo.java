package com.study.facade;

import com.study.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zyy
 * @description: todo
 */
@DubboService(mock = "true")
public class HelloDubbo implements HelloService {
    @Override
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
