package com.pine.service.provider;


import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getUsername() {
        System.out.println("调用getUsername=========");
        return "pine";
    }
}
