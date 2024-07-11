package com.yupi.springbootinit.service.impl.innerService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.springbootinit.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.gatech.henryapicommon.model.entity.InterfaceInfo;
import org.gatech.henryapicommon.service.InnerInterfaceInfoService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    InterfaceInfoMapper interfaceInfoMapper;
    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        if (path==null || method ==null) throw new BusinessException(ErrorCode.PARAMS_ERROR);
        QueryWrapper<InterfaceInfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("url",path);
        queryWrapper.eq("method",method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }


}
