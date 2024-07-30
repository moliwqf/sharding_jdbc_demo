package com.moli.sharding.tenant.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.moli.sharding.tenant.entity.User;
import com.moli.sharding.tenant.entity.UserRole;
import com.moli.sharding.tenant.mapper.UserRoleMapper;
import com.moli.sharding.tenant.service.RoleService;
import com.moli.sharding.tenant.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;

/**
 * @author moli
 * @time 2024-07-28 14:52:48
 */
@RestController
@RequestMapping("tenant")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private UserRoleMapper userRoleMapper;

    @PostMapping("/addUser")
    public User addUser(User user, Long roleId) {
        userService.save(user);
        UserRole userRole = new UserRole();
        userRole.setRoleId(roleId);
        userRole.setUserId(user.getId());
        userRoleMapper.insert(userRole);
        return user;
    }

    @GetMapping("/getUserByUserName")
    public User getUserByUserName(@RequestParam("userName") String userName) {
        return userService.getOne(
                new LambdaQueryWrapper<User>()
                        .eq(User::getUserName, userName)
        );
    }
}
