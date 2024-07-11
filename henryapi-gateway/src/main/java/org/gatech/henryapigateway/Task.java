package org.gatech.henryapigateway;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.gatech.henryapicommon.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/b")
@RestController
public class Task {

    @DubboReference
    private DemoService demoService;

    @GetMapping("/nothing")
    public String doNothing(String name){
//        return "abc";
        return demoService.sayHello(name);
    }

}
