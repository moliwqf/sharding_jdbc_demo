package com.moli.sharding.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moli.sharding.tenant.entity.User;
import com.moli.sharding.tenant.mapper.UserMapper;
import com.moli.sharding.tenant.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author moli
 * @time 2024-07-28 14:55:18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
