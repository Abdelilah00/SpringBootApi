package com.tools.configuration;

import com.springBootApi.domains.User;
import com.springBootApi.repositorys.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IUserRepository IUserRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = IUserRepository.findByUserName(userName);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + userName));
        return user.map(UserDetailsImpl::new).get();
    }
}
