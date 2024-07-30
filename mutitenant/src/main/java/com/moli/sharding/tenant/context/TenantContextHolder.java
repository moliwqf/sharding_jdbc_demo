package com.moli.sharding.tenant.context;

/**
 * @author moli
 * @time 2024-07-28 15:06:05
 * @description tenant 持有
 */
public class TenantContextHolder {

    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<>();

    public static void set(String tenant) {
        THREAD_LOCAL.set(tenant);
    }

    public static String get() {
        return THREAD_LOCAL.get();
    }

    public static void remove() {
        THREAD_LOCAL.remove();
    }
}
