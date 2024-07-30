package com.moli.sharding.tenant.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moli.sharding.tenant.entity.Role;

import java.util.List;

/**
 * @author moli
 * @time 2024-07-28 14:54:52
 */
public interface RoleService extends IService<Role> {

    boolean saveUserRole(Long userId, List<Long> roleId);
}
