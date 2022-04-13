package com.study.service;

/**
 * @author zyy
 * @description: todo
 */
public interface DubboTestService {

    String sayHi();
}

/**
 * 降级接口
 */
class DubboTestServiceMock implements DubboTestService{

    @Override
    public String sayHi() {
        return "不好意思出错了";
    }
}
