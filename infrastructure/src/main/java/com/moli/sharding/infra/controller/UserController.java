package com.moli.sharding.infra.controller;

import com.moli.sharding.infra.entity.Order;
import com.moli.sharding.infra.entity.User;
import com.moli.sharding.infra.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author moli
 * @time 2024-07-22 10:49:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 新增
     *
     * @return Order
     */
    @PostMapping("save")
    public User save() {
        return userService.save();
    }
}
