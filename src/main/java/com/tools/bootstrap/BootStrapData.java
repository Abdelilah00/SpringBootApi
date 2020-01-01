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
        User admin = new User();
        admin.setActive(true);
        admin.setUserName("admin");
        admin.setPassword("admin");
        admin.setRoles("ADMIN");
        userRepository.save(admin);

        User user = new User();
        user.setActive(true);
        user.setUserName("user");
        user.setPassword("user");
        user.setRoles("USER");
        userRepository.save(user);
    }
}
