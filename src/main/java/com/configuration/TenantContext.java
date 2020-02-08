package com.configuration;

import com.configuration.security.UserAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

public class TenantContext {

    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    //TODO :  include Safe thread ??

    public static long getCurrentTenant() {
        if (SecurityContextHolder.getContext() != null) {
            var userId = ((UserAuth) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId();
            logger.info("UserId ############### =>" + userId);
            return userId;
        }
        logger.info("#################### Catch ####################");
        return 1L;
    }
}

