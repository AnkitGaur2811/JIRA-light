package com.jiralight.ProdManagement.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.jiralight.ProdManagement.Repositories.CompanyRepository;
import com.jiralight.ProdManagement.Repositories.UserRepository;
import com.jiralight.ProdManagement.entities.Board;
import com.jiralight.ProdManagement.entities.Company;
import com.jiralight.ProdManagement.entities.User;

import java.util.Collections;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/users")
public class UserSignupContoller {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {

        if (user.getUserName() == null || user.getUserName().isEmpty() ||
                user.getUserEmail() == null || user.getUserEmail().isEmpty() ||
                user.getUserPassword() == null || user.getUserPassword().isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }

        if (userRepository.existsByUserEmail(user.getUserEmail())) {
            return ResponseEntity.badRequest().body(null);
        }
        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        user.setCreatedOn(new Date());
        user.setLastLogin(new Date());
        if (user.getEMPkey() != null && !user.getEMPkey().isEmpty()) {
            Company company = companyRepository.findByEmpKey(user.getEMPkey());
            if (company != null) {
                user.setCompany(company);
                user.setEmp(true); 
            } else {
                return ResponseEntity.badRequest().body(null); // Invalid empId
            }
        } else {
            user.setEmp(false); // Mark as non-employee
        }

        User savedUser = userRepository.save(user);

        if (user.getCompany() == null) {
            Board personalBoard = new Board();
            personalBoard.setPersonal(true);
            personalBoard.setOwnerId(savedUser);
            savedUser.setOwnedBboards(Collections.singletonList(personalBoard));
            userRepository.save(savedUser); // Save user with personal board
        }

        return ResponseEntity.ok(savedUser);
    }
}
