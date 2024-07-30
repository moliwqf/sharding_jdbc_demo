package com.moli.sharding.tenant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moli.sharding.tenant.entity.Role;
import com.moli.sharding.tenant.entity.User;
import com.moli.sharding.tenant.mapper.RoleMapper;
import com.moli.sharding.tenant.mapper.UserMapper;
import com.moli.sharding.tenant.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author moli
 * @time 2024-07-28 14:55:55
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    @Override
    public boolean saveUserRole(Long userId, List<Long> roleId) {
        int rows = this.baseMapper.saveUserRole(userId, roleId);
        return rows == roleId.size();
    }
}
