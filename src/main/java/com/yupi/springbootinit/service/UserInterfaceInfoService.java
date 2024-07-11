package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.gatech.henryapicommon.model.entity.InterfaceInfo;
import org.gatech.henryapicommon.model.entity.UserInterfaceInfo;

/**
* @author hsu
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-07-05 15:49:43
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    public void validInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    public boolean invokeCount(Long userId, Long interfaceId);
}
