package com.moli.sharding.infra.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moli.sharding.infra.entity.User;

/**
 * @author moli
 * @time 2024-07-22 10:49:52
 */
public interface UserService extends IService<User> {

    User save();
}
