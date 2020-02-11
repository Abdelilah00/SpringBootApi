////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2020                                                          /
// developed by Abdelilah Dehaoui GitHub : Abdelilah00                         /
////////////////////////////////////////////////////////////////////////////////

package com.configuration.bootstrap;

import com.configuration.TenantContext;
import com.configuration.security.domains.Role;
import com.configuration.security.domains.RoleName;
import com.configuration.security.domains.User;
import com.configuration.security.repositorys.IUserRepository;
import com.springBootApi.domains.Customer;
import com.springBootApi.domains.Product;
import com.springBootApi.repositorys.ICustomerRepository;
import com.springBootApi.repositorys.IProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
public class BootStrapData implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(TenantContext.class.getName());
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IProductRepository productService;
    @Autowired
    private ICustomerRepository customerService;


    @Override
    public void run(String... args) throws Exception {

        Role userRole = new Role();
        userRole.setName(RoleName.ROLE_USER);
        User userUser = new User("user", passwordEncoder.encode("user"), "user@x.com", true, Collections.singletonList(userRole));
        userRepository.save(userUser);

        Role adminRole = new Role();
        adminRole.setName(RoleName.ROLE_ADMIN);
        User userAdmin = new User("admin", passwordEncoder.encode("admin"), "admin@x.com", true, Collections.singletonList(adminRole));
        userRepository.save(userAdmin);


        Customer customer = new Customer("Abdelilah 1", "Dehaoui", "abdelilah@gelail.cop");
        customer.setTenantId(1L);
        customerService.save(customer);

        Customer customer1 = new Customer("Jamal 2", "Elghafouli", "abdelilah@gelail.cop");
        customer.setTenantId(2L);
        customerService.save(customer1);

        /*customerService.save(new Customer("Dalila", "makhloufi"));
        customerService.save(new Customer("mourad", "jou3"));
        customerService.save(new Customer("imane", "lehbetri"));
        customerService.save(new Customer("marouan", "majdoubi"));
        customerService.save(new Customer("ikrame", "louni"));
        customerService.save(new Customer("lamyae", "tal7awi"));*/


        var prod1 = new Product("Bimoo from tenant 1", 10L, new ArrayList<>());
        prod1.setTenantId(1L);
        productService.save(prod1);

        var prod2 = new Product("Picala from tenant 2", 10L, new ArrayList<>());
        prod2.setTenantId(2L);
        productService.save(prod2);
    }
}
