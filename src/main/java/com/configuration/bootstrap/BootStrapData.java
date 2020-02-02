package com.configuration.bootstrap;

import com.configuration.security.repositorys.IUserRepository;
import com.springBootApi.domains.Product;
import com.springBootApi.repositorys.IProductRepository;
import lombok.var;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;

@Component
public class BootStrapData implements CommandLineRunner {
    private SessionFactory sessionFactory;

    @Autowired
    public BootStrapData(EntityManagerFactory factory) {
        if (factory.unwrap(SessionFactory.class) == null) {
            throw new NullPointerException("factory is not a hibernate factory");
        }
        this.sessionFactory = factory.unwrap(SessionFactory.class);
    }

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        var prod1 = new Product("Bimoo from tenant 1", new ArrayList<>());
        prod1.setTenantId("1");
        productRepository.save(prod1);

        var prod2 = new Product("Picala from tenant 2", new ArrayList<>());
        prod2.setTenantId("2");
        productRepository.save(prod2);


        /*Role userRole = new Role();
        userRole.setName(RoleName.ROLE_USER);

        Role adminRole = new Role();
        adminRole.setName(RoleName.ROLE_ADMIN);

        userRepository.save(new User(0, "admin", passwordEncoder.encode("admin"), "admin@x.com", true, Collections.singletonList(adminRole)));
        userRepository.save(new User(0, "user", passwordEncoder.encode("user"), "user@x.com", true, Collections.singletonList(userRole)));
*/
    }
}
