package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.gatech.henryapicommon.model.entity.InterfaceInfo;

/**
*  hsu
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-05 15:46:12
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
