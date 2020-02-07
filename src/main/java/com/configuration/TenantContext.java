package com.configuration;

import com.configuration.security.UserAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

public class TenantContext {

    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    //TODO :  LinkedBlockingQueue ??

    public static long getCurrentTenant() {
        try {

            var auth = SecurityContextHolder.getContext().getAuthentication();
            var userId = ((UserAuth) auth.getPrincipal()).getUserId();
            logger.info("UserId ############### =>" + userId);
            return userId;
        } catch (Exception ex) {
            logger.info("UserId ############### => Catch");
            return 1L;
        }
    }

}

