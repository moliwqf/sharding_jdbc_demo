package com.moli.sharding.infra.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moli.sharding.infra.entity.User;
import com.moli.sharding.infra.mapper.UserMapper;
import com.moli.sharding.infra.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


/**
 * @author moli
 * @time 2024-07-22 10:50:06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User save() {
        User user = new User();
        user.setUName("wang");
        user.setUAge(10);
        user.setUAddress("湖北");
        user.setDateTime(LocalDateTime.of(2003, 7, 25, 0, 0));
        baseMapper.insert(user);
        return user;
    }
}
