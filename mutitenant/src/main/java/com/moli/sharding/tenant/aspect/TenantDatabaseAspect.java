package com.moli.sharding.tenant.aspect;

import com.moli.sharding.tenant.context.TenantContextHolder;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author moli
 * @time 2024-07-28 15:00:37
 * @description 租户切面
 */
@Aspect
@Component
public class TenantDatabaseAspect {

    @Pointcut("execution(* com.moli.sharding.tenant.mapper.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void setDatabaseBefore() {
        HintManager.clear();
        HintManager manager = HintManager.getInstance();
        manager.setDatabaseShardingValue(TenantContextHolder.get());
    }

    @After("pointcut()")
    public void clearDatabaseAfter() {
        HintManager.clear();
    }
}
