package com.configuration.bootstrap;

import com.configuration.security.domains.Role;
import com.configuration.security.domains.User;
import com.configuration.security.repositorys.IRoleRepository;
import com.configuration.security.repositorys.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();
        role.setRole("ROLE_USER");

        Role role1 = new Role();
        role1.setRole("ROLE_ADMIN");

        userRepository.save(new User(0, "user", "user", "y@y.com", true, Collections.singletonList(role)));
        userRepository.save(new User(0, "admin", "admin", "x@x.com", true, Collections.singletonList(role1)));
    }
}
