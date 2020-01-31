package com.configuration;

import com.springBootApi.services.ProductService;
import lombok.var;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;

@Aspect
@Component
public class EnableFilterAspect {

    @AfterReturning(
            pointcut="bean(entityManagerFactory) && execution(* createEntityManager(..))",
            returning="retVal")
    public void getSessionAfter(JoinPoint joinPoint, Object retVal) {
        if (retVal != null && EntityManager.class.isInstance(retVal)) {
            Session session = ((EntityManager) retVal).unwrap(Session.class);
            var x =TenantContext.getCurrentTenant();
            session.enableFilter("tenantFilter").setParameter("tenantId", x);
        }
    }

}
