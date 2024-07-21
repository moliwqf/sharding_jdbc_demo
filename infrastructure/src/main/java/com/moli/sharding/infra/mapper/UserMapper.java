package com.moli.sharding.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moli.sharding.infra.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author moli
 * @time 2024-07-21 22:10:25
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
