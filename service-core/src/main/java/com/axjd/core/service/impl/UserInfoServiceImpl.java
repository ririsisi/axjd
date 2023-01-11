package com.axjd.core.service.impl;

import com.axjd.core.pojo.entity.UserInfo;
import com.axjd.core.mapper.UserInfoMapper;
import com.axjd.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author ririsisi
 * @since 2023-01-11
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
