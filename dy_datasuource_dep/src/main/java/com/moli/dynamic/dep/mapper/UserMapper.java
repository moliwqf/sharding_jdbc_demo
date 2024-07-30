package com.moli.dynamic.dep.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moli.dynamic.dep.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author moli
 * @time 2024-07-19 22:02:47
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
