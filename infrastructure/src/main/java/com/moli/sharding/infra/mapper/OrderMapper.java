package com.moli.sharding.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moli.sharding.infra.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author moli
 * @time 2024-07-21 22:09:13
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
