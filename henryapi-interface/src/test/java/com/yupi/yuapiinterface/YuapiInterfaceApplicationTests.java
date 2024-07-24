package com.yupi.yuapiinterface;

import org.gatech.henryapiclient.client.HenryClient;
import org.gatech.henryapiclient.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 *  
 * 
 */
@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    HenryClient henryClient;

    @Test
    void testClient(){
        System.out.println(1);
        User user=new User();
        user.setUsername("aaaa");
        System.out.println(henryClient.getUsernameByPost(user));
    }
}
