package com.moli.sharding.infra.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moli.sharding.infra.entity.Order;

/**
 * @author moli
 * @time 2024-07-21 22:04:36
 */
public interface OrderService extends IService<Order> {

    Order save();
}
