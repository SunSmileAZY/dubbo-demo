package com.pine.config.xml;

import com.pine.service.provider.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerXml {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/dubbo-client.xml");

        ctx.start();
        System.out.println("---------dubbo启动成功--------");
        // get remote service proxy
        UserService orderService = (UserService) ctx.getBean("userService");

        String username = orderService.getUsername();
        System.out.println(" ConsumerXml result: " + username);

    }
}
