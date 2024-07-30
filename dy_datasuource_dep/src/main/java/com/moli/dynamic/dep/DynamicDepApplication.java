package com.moli.dynamic.dep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moli
 * @time 2024-07-30 11:44:29
 */
@MapperScan("com.moli.dynamic.dep.mapper")
@SpringBootApplication
public class DynamicDepApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDepApplication.class, args);
    }

}
