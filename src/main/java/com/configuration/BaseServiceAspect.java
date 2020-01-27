package com.configuration;

import com.springBootApi.services.ProductService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BaseServiceAspect {
    @Before("execution(* com.springBootApi.services(..))&& target(service) ")
    public void aroundExecution(JoinPoint pjp, ProductService service) throws Throwable {
        org.hibernate.Filter filter = service.getSessionFactory().getCurrentSession().enableFilter("tenantFilter");
        filter.setParameter("tenantId", TenantContext.getCurrentTenant());
        filter.validate();
    }
}
