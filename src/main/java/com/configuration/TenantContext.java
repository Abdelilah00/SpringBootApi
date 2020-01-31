package com.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TenantContext {

    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    // TODO : ThreadLocal include
    private static String currentTenant = "1";

    public static String getCurrentTenant() {
        logger.info("Getting tenant to => " + currentTenant);
        return currentTenant;
    }

    public static void setCurrentTenant(String tenant) {
        logger.info("Setting tenant to =>" + tenant);
        currentTenant = tenant;
    }

    public static void clear() {
        currentTenant = null;
    }

}

