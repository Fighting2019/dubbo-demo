package com.study;

import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zyy
 * @description: todo
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDubbo {

    @DubboReference
    private HelloService helloService;

    @Test
    public void testDubbo(){
        helloService.sayHello();
    }
}
