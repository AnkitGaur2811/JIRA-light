package com.jiralight.ProdManagement.Sevices.Impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.Config.AuthConfig;
import com.jiralight.ProdManagement.Repositories.UserRepository;
import com.jiralight.ProdManagement.Sevices.UserService;
import com.jiralight.ProdManagement.entities.Board;
import com.jiralight.ProdManagement.entities.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    

    @Override
    public User saveUser(User user) {
        /*
         * User provides username, email, password (hashed using BCryptPasswordEncoder).
         * System checks if email already exists (unique constraint on email column).
         * If email is unique, create a new User entity with the provided information,
         * setting isAdmin to false.
         * If no company empKey is provided, create a new Board entity marked as
         * isPrivate (personal board) and associate it with the user.
         * Save the User and Board entities.
         */

        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));// password hashing

        if (userRepository.existsByEmail(user.getUserEmail())) {
            throw new IllegalArgumentException("Email address already exists!"); // Handle duplicate email
        }

        if(user.getCompany() == null){
            Board personalBoard = new Board();
            personalBoard.setPersonal(true);
            personalBoard.setOwnerId(user);
            user.setOwnedBboards(Collections.singletonList(personalBoard));
        }

        System.out.println("----> User Saved");
        return userRepository.save(user);
    }

}
