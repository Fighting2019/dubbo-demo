package com.study.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zyy
 * @description: todo
 */
@Configuration
@EnableDubboConfig
@DubboComponentScan(basePackages = {"com.study.facade"})
/*@EnableDubbo(scanBasePackages = {"com.study.facade"})*/
public class DubboConfig {

    //@Value("${dubbo.application.name}")
    private String applicationName = "dubbo.application";
    //@Value("${dubbo.registry.address}")
    private String registryAddress;

    /**
     * <dubbo:application />
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setLogger("slf4j");
        applicationConfig.setName(applicationName);
        return applicationConfig;
    }

    /**
     * <dubbo:registry />
     * @return
     */
    //@Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setPort(2181);
        registryConfig.setAddress(registryAddress);
        registryConfig.setTimeout(15000);
        return registryConfig;
    }

    /**
     * <dubbo:protocol />
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig("dubbo",20880);
        //protocolConfig.setSerialization("java");
        return protocolConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig(){
        return new ConsumerConfig();
    }
}
