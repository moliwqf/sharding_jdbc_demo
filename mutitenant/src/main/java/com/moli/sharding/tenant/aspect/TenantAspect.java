package com.moli.sharding.tenant.aspect;

import com.moli.sharding.tenant.context.TenantContextHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author moli
 * @time 2024-07-28 15:08:08
 * @description 获取 tenant 参数
 */
@Aspect
@Component
public class TenantAspect {

    @Resource
    private HttpServletRequest request;

    @Pointcut("execution(* com.moli.sharding.tenant.controller.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void setDatabaseBefore() {
        String tenant = request.getParameter("tenant");
        TenantContextHolder.set(tenant);
    }

    @After("pointcut()")
    public void clearDatabaseAfter() {
        TenantContextHolder.remove();
    }
}
