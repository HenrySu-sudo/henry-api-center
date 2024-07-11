package com.yupi.springbootinit.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.exception.BusinessException;
import org.gatech.henryapicommon.model.entity.UserInterfaceInfo;
import com.yupi.springbootinit.mapper.UserInterfaceInfoMapper;
import com.yupi.springbootinit.service.UserInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.elasticsearch.core.query.UpdateQuery;
import org.springframework.stereotype.Service;

/**
* @author hsu
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-07-05 15:49:43
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

    @Override
    public void validInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        if(userInterfaceInfo.getUserId()<0 || userInterfaceInfo.getInterfaceInfoId()<0) throw new BusinessException(ErrorCode.NOT_FOUND_ERROR,"接口不存在");

        if(userInterfaceInfo.getLeftNum()<=0) throw new BusinessException(ErrorCode.NO_AUTH_ERROR,"剩余次数为0");
    }

    @Override
    public boolean invokeCount(Long userId, Long interfaceId) {
        if(userId<0 || interfaceId<0) throw new BusinessException(ErrorCode.PARAMS_ERROR,"用户或接口不存在");

        UpdateWrapper<UserInterfaceInfo> query=new UpdateWrapper<>();

        query.eq("userID",userId);
        query.eq("interfaceInfoId",interfaceId);
        query.setSql("leftNum = leftNum - 1, totalNum = totalNum + 1");
        return this.update(query);
    }
}




