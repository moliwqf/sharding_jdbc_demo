package com.moli.sharding.tenant.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author moli
 * @time 2024-07-30 10:53:43
 */
@Data
@ToString
public class UserRole {

    private Long id;

    private Long userId;

    private Long roleId;
}
