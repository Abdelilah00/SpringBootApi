package com.configuration.security.controller;

import com.configuration.security.UserDetailsServiceImpl;
import com.configuration.security.dto.JwtResponse;
import com.configuration.security.dto.SignInRequest;
import com.configuration.security.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private AuthenticationManager authenticationManager;


    @PostMapping(path = "signIn")
    public JwtResponse signIn(@RequestBody SignInRequest signInRequest) {
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUserName(), signInRequest.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);

        UserDetails userDetails = userDetailsService.loadUserByUsername(signInRequest.getUserName());
        return new JwtResponse(jwtTokenProvider.createToken(userDetails));
    }

    @PostMapping(path = "signUp")
    public JwtResponse signUp(@RequestBody SignInRequest signUpRequest) {
        return null;
    }

}
