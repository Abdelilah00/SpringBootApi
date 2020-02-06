package com.configuration.bootstrap;

import com.configuration.TenantContext;
import com.configuration.security.repositorys.IUserRepository;
import com.springBootApi.domains.Customer;
import com.springBootApi.domains.Product;
import com.springBootApi.services.CustomerService;
import com.springBootApi.services.ProductService;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;

@Component
public class BootStrapData implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    private SessionFactory sessionFactory;
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;

    @Autowired
    public BootStrapData(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Override
    public void run(String... args) throws Exception {
        TenantContext.setCurrentTenant("1");

        var prod1 = new Product("Bimoo from tenant 1", new ArrayList<>());
        prod1.setTenantId("1");
        productService.save(prod1);

        var prod2 = new Product("Picala from tenant 2", new ArrayList<>());
        prod2.setTenantId("2");
        productService.save(prod2);

     /* var currentSession= sessionFactory.getCurrentSession();
        currentSession.beginTransaction();
        CriteriaBuilder builder = currentSession.getCriteriaBuilder();
        currentSession.enableFilter("tenantFilter").setParameter("tenantId", TenantContext.getCurrentTenant()).validate();
        CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
        criteria.from(Product.class);
        logger.info("####################### Result => "+currentSession.createQuery(criteria).getResultList());*/


        /*Role userRole = new Role();
        userRole.setName(RoleName.ROLE_USER);
        User userUser =new User(0, "user", passwordEncoder.encode("user"), "user@x.com", true, Collections.singletonList(userRole));
        userRepository.save(userUser);

        Role adminRole = new Role();
        adminRole.setName(RoleName.ROLE_ADMIN);
        User userAdmin =new User(0, "admin", passwordEncoder.encode("admin"), "admin@x.com", true, Collections.singletonList(adminRole));
        userRepository.save(userAdmin);*/

        customerService.save(new Customer("Abdelilah", "Dehaoui"));
        customerService.save(new Customer("Jamal", "Elghafouli"));
        customerService.save(new Customer("Dalila", "makhloufi"));
        customerService.save(new Customer("mourad", "jou3"));
        customerService.save(new Customer("imane", "lehbetri"));
        customerService.save(new Customer("marouan", "majdoubi"));
        customerService.save(new Customer("ikrame", "louni"));
        customerService.save(new Customer("wafae", "tal7awi"));
    }
}
