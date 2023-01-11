package com.axjd.core.service.impl;

import com.axjd.core.pojo.entity.UserAccount;
import com.axjd.core.mapper.UserAccountMapper;
import com.axjd.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author ririsisi
 * @since 2023-01-11
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
