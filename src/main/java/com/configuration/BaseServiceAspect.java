package com.configuration;

import com.springBootLibrary.services.BaseCrudServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BaseServiceAspect {
    @Before("execution(* com.springBootLibrary.services.BaseCrudServiceImpl*(..))&& target(service) ")
    public void aroundExecution(JoinPoint pjp, BaseCrudServiceImpl service) throws Throwable {
        org.hibernate.Filter filter = service.getSession().enableFilter("tenantFilter");
        filter.setParameter("tenantId", TenantContext.getCurrentTenant());
        filter.validate();
    }
}
