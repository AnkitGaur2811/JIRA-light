package com.jiralight.ProdManagement.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jiralight.ProdManagement.Sevices.UserService;
import com.jiralight.ProdManagement.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userRegistrationDto) {
        userService.registerNewUser(userRegistrationDto);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }

    @GetMapping("/login")
    public String getMethodName() {
        return "Hello";
    }
    
}
