package com.configuration;

/*@Aspect
@Component
public class EnableFilterAspect {

   @AfterReturning(
            pointcut = "bean(entityManagerFactory) && execution(* createEntityManager(..))",
            returning = "retVal")
    public void getSessionAfter(JoinPoint joinPoint, Object retVal) {
        if (retVal != null && EntityManager.class.isInstance(retVal)) {
            Session session = ((EntityManager) retVal).unwrap(Session.class);
            var x = TenantContext.getCurrentTenant();
            session.enableFilter("tenantFilter").setParameter("tenantId", x);
        }
    }

}*/
