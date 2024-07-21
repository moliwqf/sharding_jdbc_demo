package com.moli.sharding.infra.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author moli
 * @time 2024-07-21 22:05:12
 */
@Accessors(chain = true)
@TableName("t_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    /**
     * 订单ID
     */
    @TableId
    private Long orderId;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;

    public Order(Long orderId) {
        this.orderId = orderId;
    }
}
