package com.yupi.springbootinit.service.impl.innerService;

import com.yupi.springbootinit.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.gatech.henryapicommon.service.InnerUserInterfaceInfoService;

import javax.annotation.Resource;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    UserInterfaceInfoService userInterfaceInfoService;
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId,userId);
    }
}
