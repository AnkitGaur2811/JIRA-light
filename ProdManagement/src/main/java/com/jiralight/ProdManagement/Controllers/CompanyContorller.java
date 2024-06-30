package com.jiralight.ProdManagement.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiralight.ProdManagement.Sevices.CompanyService;
import com.jiralight.ProdManagement.dto.CompanyDTO;
import com.jiralight.ProdManagement.entities.Company;

@RestController
@RequestMapping("/api/company")
public class CompanyContorller {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCompany(@RequestBody CompanyDTO companySignupDTO) {
        companyService.registerCompany(companySignupDTO);

        return new ResponseEntity<>("Comapny registered successfully", HttpStatus.CREATED);

    }
    
}
