package com.moli.sharding.tenant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moli
 * @time 2024-07-28 14:33:53
 * @description sharding-jdbc 解决多租户问题
 */
@MapperScan("com.moli.sharding.tenant.mapper")
@SpringBootApplication
public class MutiTenantApplication {

    public static void main(String[] args) {
        SpringApplication.run(MutiTenantApplication.class, args);
    }
}
