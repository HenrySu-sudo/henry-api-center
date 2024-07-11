package com.yupi.springbootinit.service.impl.innerService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import com.yupi.springbootinit.mapper.UserMapper;
import com.yupi.springbootinit.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.gatech.henryapicommon.model.entity.User;
import org.gatech.henryapicommon.service.InnerUserService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    UserMapper userMapper;
    @Override
    public User getInvokeUser(String accessKey) {
        if(StringUtils.isAnyBlank(accessKey)) throw new BusinessException(ErrorCode.PARAMS_ERROR);

        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
