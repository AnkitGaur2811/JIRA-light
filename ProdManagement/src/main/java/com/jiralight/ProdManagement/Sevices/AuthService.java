package com.jiralight.ProdManagement.Sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.dto.LoginDTO;

@Service
public class AuthService {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired 
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

     public void authenticateUser(LoginDTO loginRequestDTO) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginRequestDTO.getEmail(),
                loginRequestDTO.getPassword()
            )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }
}
