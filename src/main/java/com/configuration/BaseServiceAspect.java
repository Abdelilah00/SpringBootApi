package com.configuration;
//TODO : Inject TenantId Filter
/*@Aspect
@Component
public class BaseServiceAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private SessionFactory sessionFactory;

    @Autowired
    public BaseServiceAspect(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }
    @Before("execution(* com.springBootLibrary.services.BaseCrudServiceImpl.*(..)) && target(service)")
    public void aroundExecution(IBaseCrudService service) throws Throwable {
        logger.info("Advice for Class => " + service.getClass().getName() + "for TenantId => " + TenantContext.getCurrentTenant());
        var currentSession = sessionFactory.getCurrentSession();
        if (!currentSession.getTransaction().isActive())
            currentSession.beginTransaction();
        currentSession.enableFilter("tenantFilter").setParameter("tenantId", TenantContext.getCurrentTenant()).validate();
    }
}*/
