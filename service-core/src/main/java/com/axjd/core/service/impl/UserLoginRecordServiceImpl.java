package com.axjd.core.service.impl;

import com.axjd.core.pojo.entity.UserLoginRecord;
import com.axjd.core.mapper.UserLoginRecordMapper;
import com.axjd.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author ririsisi
 * @since 2023-01-11
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
