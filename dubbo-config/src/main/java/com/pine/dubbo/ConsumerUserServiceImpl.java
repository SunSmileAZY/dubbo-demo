package com.pine.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pine.service.UserService;
import org.springframework.stereotype.Component;

@Component("annotatedConsumer")
public class ConsumerUserServiceImpl {

    @Reference
    private UserService userService;

    public String getUsername(){
        System.out.println("调用到ConsumerUserServiceImpl.getUsername()");
        return userService.getUsername();
    }

}
