package com.pine.service.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pine.service.provider.UserService;
import org.springframework.stereotype.Component;

/**
 * 提供给dubbo消费端
 * @author pine
 */
@Component("annotatedConsumer")
public class ConsumerUserServiceImpl {

    @Reference
    private UserService userService;

    public String getUsername(){
        System.out.println("调用到ConsumerUserServiceImpl.getUsername()");
        return userService.getUsername();
    }

}
