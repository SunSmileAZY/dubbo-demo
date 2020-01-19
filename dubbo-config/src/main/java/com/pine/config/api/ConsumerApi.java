package com.pine.config.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.pine.service.provider.UserService;

/**
 * api 方式
 * api方式主要是用于架构方面的修改
 * @author pine
 */
public class ConsumerApi {

    public static void main(String[] args) {
        ReferenceConfig<UserService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("api-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://47.93.206.149:20181"));
        reference.setInterface(UserService.class);
        UserService orderService = reference.get();

        String username = orderService.getUsername();
        System.out.println("result: " + username);
    }
}
