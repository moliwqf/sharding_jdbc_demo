package com.moli.dynamic.dep.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.moli.dynamic.dep.entity.User;
import com.moli.dynamic.dep.mapper.UserMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author moli
 * @time 2024-07-19 21:58:28
 */
@RestController
@RequestMapping("/dynamic/dep")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @DS("master")
    @PostMapping("/saveUserMaster")
    public String saveUserMaster(User user) {
        User save = User.newUser(user);
        int insert = userMapper.insert(save);
        if (insert == 1) return "success";
        return "error";
    }

    @DS("slave")
    @PostMapping("/saveUserSlave")
    public String saveUserSlave(User user) {
        User save = User.newUser(user);
        int insert = userMapper.insert(save);
        if (insert == 1) return "success";
        return "error";
    }
}
