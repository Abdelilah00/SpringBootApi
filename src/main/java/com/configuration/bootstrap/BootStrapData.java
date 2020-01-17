package com.configuration.bootstrap;

import com.configuration.security.domains.Role;
import com.configuration.security.domains.User;
import com.configuration.security.repositorys.IUserRepository;
import com.springBootApi.domains.Owner;
import com.springBootApi.domains.Product;
import com.springBootLibrary.IBaseJpaRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private IBaseJpaRepository<Product> productRepository;
    @Autowired
    private IBaseJpaRepository<Owner> ownerRepository;

    @Override
    public void run(String... args) throws Exception {

        productRepository.save(new Product("Bimoo", new ArrayList<>()));
        productRepository.save(new Product("Picala", new ArrayList<>()));
        var userRole = new Role();
        userRole.setName("ROLE_USER");

        var adminRole = new Role();
        adminRole.setName("ROLE_ADMIN");

        userRepository.save(new User(0, "admin", passwordEncoder.encode("admin"), "admin@x.com", true, Collections.singletonList(adminRole)));
        userRepository.save(new User(0, "user", passwordEncoder.encode("user"), "user@x.com", true, Collections.singletonList(userRole)));

        var owner = new Owner();
        owner.setFirstName("Abdelilah");
        owner.setLastName("Dehaoui");
        ownerRepository.save(owner);
    }
}
