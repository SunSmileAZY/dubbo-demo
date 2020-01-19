package com.pine.config.api;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.pine.service.provider.UserService;
import com.pine.service.provider.UserServiceImpl;

import java.io.IOException;

/**
 *
 * @author pine
 */
public class ProviderApi {

    public static void main(String[] args) throws IOException {
        ServiceConfig<UserService> config = new ServiceConfig<>();
        config.setApplication(new ApplicationConfig("api-provider"));
        config.setRegistry(new RegistryConfig("zookeeper://47.93.206.149:20181"));
        config.setInterface(UserService.class);
        config.setRef(new UserServiceImpl());
        config.export();

        System.out.println("first-dubbo-provider is running.");
        System.in.read();
    }


}
