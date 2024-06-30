package com.jiralight.ProdManagement.Sevices;

import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.dto.UserDTO;
import com.jiralight.ProdManagement.entities.User;


public interface UserService {
    User registerNewUser(UserDTO user);
    User registerUser(User user);
    
}
