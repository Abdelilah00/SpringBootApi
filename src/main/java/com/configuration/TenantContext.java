package com.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TenantContext {

    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    // TODO : ThreadLocal include
    private static String currentTenant = "1";

    public static String getCurrentTenant() {
        return currentTenant;
    }

    public static void setCurrentTenant(String tenant) {
        currentTenant = tenant;
    }

    public static void clear() {
        currentTenant = null;
    }

}

