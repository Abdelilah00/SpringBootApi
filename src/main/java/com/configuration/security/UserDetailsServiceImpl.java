package com.configuration.security;

import com.configuration.security.domains.User;
import com.configuration.security.repositorys.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final User user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("User '" + userName + "' not found");
        }
/*
        return org.springframework.security.core.userdetails.User//
                .withUsername(userName)//
                .password(user.getPassword())//
                .authorities(user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList()))//
                .accountExpired(false)//
                .accountLocked(false)//
                .credentialsExpired(false)//
                .disabled(false)//
                .build();*/

        var userAuth = new UserAuth(
                user.getUserName(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                user.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList())
                , user.getId());
        return userAuth;
    }

}
