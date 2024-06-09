package com.jiralight.ProdManagement.Sevices.Impl;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.Repositories.CompanyRepository;
import com.jiralight.ProdManagement.Sevices.CompanyService;
import com.jiralight.ProdManagement.Sevices.UserService;
import com.jiralight.ProdManagement.entities.Board;
import com.jiralight.ProdManagement.entities.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
    
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;

    

    @Override
    public Company saveCompany(Company company){
        company.getAdminUser().setUserPassword(passwordEncoder.encode(company.getAdminUser().getUserPassword())); //hashed password for admin user
        company.setEmpKey(generateRandomkey());
        Company savedCompany = companyRepository.save(company);
        userService.saveUser(company.getAdminUser());
        Board companyBoard = new Board(); 
        companyBoard.setCompany(savedCompany); 
        companyRepository.save(savedCompany); 
        return savedCompany;
    }

    private String generateRandomkey() {
        String randomString = RandomStringUtils.randomAlphanumeric(25);
        while (companyRepository.existsByEmpKey(randomString)) {
            randomString = RandomStringUtils.randomAlphanumeric(25); // Generate again if not unique
        }
        return randomString;
    }
}
