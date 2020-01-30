package com.configuration;

/*@Aspect
@Component
public class BaseServiceAspect {
    @Autowired
    private Session session;

    @Before("execution(* com.springBootApi(..)) && target(service) ")
    public void aroundExecution(JoinPoint pjp, IBaseCrudService service) throws Throwable {
        org.hibernate.Filter filter = session.enableFilter("tenantFilter");
        filter.setParameter("tenantId", TenantContext.getCurrentTenant());
        filter.validate();
    }
}*/
