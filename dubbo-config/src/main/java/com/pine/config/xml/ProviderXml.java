package com.pine.config.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author pine
 */
public class ProviderXml {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/dubbo-server.xml");

        ctx.start();
        System.out.println("---------dubbo启动成功--------");

        // 保证服务一直开着
        synchronized (ProviderXml.class) {
            try {
                ProviderXml.class.wait();
            } catch (Throwable e) {
            }
        }

    }

}
