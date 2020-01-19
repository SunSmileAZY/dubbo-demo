package com.pine.config.pro;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ProviderPro {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo 启动成功");
        System.in.read();
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.pine.service.provider")
    @PropertySource("classpath:/dubbo-provider.properties")
    static class ProviderConfiguration {
    }
}
