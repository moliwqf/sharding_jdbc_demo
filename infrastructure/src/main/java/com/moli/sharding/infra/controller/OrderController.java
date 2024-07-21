package com.moli.sharding.infra.controller;

import com.moli.sharding.infra.entity.Order;
import com.moli.sharding.infra.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author moli
 * @time 2024-07-21 22:04:24
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 新增
     *
     * @return Order
     */
    @PostMapping("save")
    public Order save() {
        return orderService.save();
    }
}
