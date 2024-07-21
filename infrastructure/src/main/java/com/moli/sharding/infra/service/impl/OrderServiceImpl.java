package com.moli.sharding.infra.service.impl;

import com.moli.sharding.infra.entity.Order;
import com.moli.sharding.infra.mapper.OrderMapper;
import com.moli.sharding.infra.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.stream.LongStream;

/**
 * @author moli
 * @time 2024-07-21 22:04:51
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Order save() {
        Order order = new Order();
        LongStream.range(1, 11).forEach(value -> orderMapper.insert(new Order(value)));
        return order;
    }
}
