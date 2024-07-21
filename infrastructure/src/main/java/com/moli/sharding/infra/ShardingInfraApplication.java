package com.moli.sharding.infra;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moli
 * @time 2024-07-21 22:02:15
 * @description sharding jdbc 基础搭建
 */
@MapperScan("com.moli.sharding.infra.mapper")
@SpringBootApplication
public class ShardingInfraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingInfraApplication.class, args);
    }
}
