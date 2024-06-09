package com.jiralight.ProdManagement.Sevices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.Repositories.UserRepository;
import com.jiralight.ProdManagement.entities.User;
import com.jiralight.ProdManagement.entities.UserDetailsImpl;

@Service
public class UserDetailsServicenew implements UserDetailsService {

    @Autowired
    private UserRepository Urepo;

    @Override
    public UserDetails loadUserByUsername(String useremail) throws UsernameNotFoundException {
        if (Urepo.existsByUserEmail(useremail)) {
            User user = Urepo.findByUserEmail(useremail);
            return new UserDetailsImpl(user);
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}

