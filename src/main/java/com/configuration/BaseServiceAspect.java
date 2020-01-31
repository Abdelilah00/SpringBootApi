package com.configuration;

import com.springBootLibrary.services.IBaseCrudService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Aspect
@Component
public class BaseServiceAspect {
    private SessionFactory sessionFactory;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    public BaseServiceAspect(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Before("execution(* com.springBootLibrary.services.BaseCrudServiceImpl.*(..)) && target(service)")
    public void aroundExecution(IBaseCrudService service) throws Throwable {
        logger.info("Advice for Class => " + service.getClass().getName());

        sessionFactory.getCurrentSession().beginTransaction();
        org.hibernate.Filter filter = sessionFactory.getCurrentSession().enableFilter("tenantFilter");

        filter.setParameter("tenantId", TenantContext.getCurrentTenant());
        filter.validate();
    }
}
