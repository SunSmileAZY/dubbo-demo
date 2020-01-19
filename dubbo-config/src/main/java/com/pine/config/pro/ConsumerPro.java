package com.pine.config.pro;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.pine.service.consumer.ConsumerUserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ConsumerPro {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        ConsumerUserServiceImpl serviceConsumer = context.getBean(ConsumerUserServiceImpl.class);
        String username = serviceConsumer.getUsername();
        System.out.println("result: " + username);

    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.pine.service.consumer")
    @PropertySource("classpath:/dubbo-consumer.properties")
    @ComponentScan(value = {"com.pine.service.consumer"})
    static class ConsumerConfiguration {

    }
}
