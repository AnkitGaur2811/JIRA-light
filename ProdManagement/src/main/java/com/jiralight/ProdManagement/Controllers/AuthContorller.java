package com.jiralight.ProdManagement.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiralight.ProdManagement.Sevices.AuthService;
import com.jiralight.ProdManagement.dto.LoginDTO;

@RestController
@RequestMapping("/api/auth")
public class AuthContorller {
    
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginRequestDTO) {
        authService.authenticateUser(loginRequestDTO);
        return ResponseEntity.ok("Login successful");
    }
}
