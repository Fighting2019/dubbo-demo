package com.study;

/**
 * @author zyy
 * @description: todo
 */
public class HelloServiceMock implements HelloService{

    @Override
    public String sayHello() {
        return "不好意思，出错了";
    }
}
