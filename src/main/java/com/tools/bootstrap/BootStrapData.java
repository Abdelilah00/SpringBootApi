package com.tools.bootstrap;

import com.springBootApi.domains.User;
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
        userRepository.save(new User(0, "admin", "admin", true, "ADMIN"));
        userRepository.save(new User(0, "user", "user", true, "USER"));
    }
}
