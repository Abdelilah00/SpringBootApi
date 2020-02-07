package com.configuration;

import com.springBootLibrary.entitys.BaseEntity;
import org.hibernate.EmptyInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class MyInterceptor extends EmptyInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
        logger.info("onDelete ### => " + TenantContext.getCurrentTenant());
        audit(entity, state, propertyNames);
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, org.hibernate.type.Type[] types) {
        logger.info("onFlushDirty ### => " + TenantContext.getCurrentTenant());
        return audit(entity, currentState, propertyNames);
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
        logger.info("onSave ### => " + TenantContext.getCurrentTenant());
        return audit(entity, state, propertyNames);
    }

    //TODO : Add Audit for each action
    private boolean audit(Object entity, Object[] currentState, String[] propertyNames) {
        boolean changed = false;
        if (entity instanceof BaseEntity) {
            for (int i = 0; i < propertyNames.length; i++) {

                if ("createdBy".equals(propertyNames[i])) {
                    Object currentDate = currentState[i];
                    if (currentDate == null) {
                        currentState[i] = TenantContext.getCurrentTenant();
                        changed = true;
                    }
                }

                if ("deletedBy".equals(propertyNames[i])) {
                    Object currentDate = currentState[i];
                    if (currentDate == null) {
                        currentState[i] = TenantContext.getCurrentTenant();
                        changed = true;
                    }
                }

                if ("updatedBy".equals(propertyNames[i])) {
                    Object currentDate = currentState[i];
                    if (currentDate == null) {
                        currentState[i] = TenantContext.getCurrentTenant();
                        changed = true;
                    }
                }
            }
        }
        return changed;
    }
}
