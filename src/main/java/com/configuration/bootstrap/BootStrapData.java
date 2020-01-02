package com.configuration.bootstrap;

import com.configuration.security.domains.User;
import com.springBootApi.repositorys.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(0, "admin", "admin", "x@x.com", true));
        userRepository.save(new User(0, "user", "user", "y@y.com", true));
    }
}
