package com.yupi.springbootinit.service.impl.innerService;

import org.apache.dubbo.config.annotation.DubboService;
import org.gatech.henryapicommon.DemoService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello"+name;
    }
}
