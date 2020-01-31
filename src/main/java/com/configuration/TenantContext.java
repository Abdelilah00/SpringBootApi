package com.configuration;

import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TenantContext {

    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    private static ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public static String getCurrentTenant() {
        var tenantId = currentTenant.get();
        logger.info("Getting tenant to => " + tenantId);
        return tenantId;
    }

    public static void setCurrentTenant(String tenant) {
        logger.info("Setting tenant to =>" + tenant);
        currentTenant.set(tenant);
    }

    public static void clear() {
        currentTenant.set(null);
    }

}

