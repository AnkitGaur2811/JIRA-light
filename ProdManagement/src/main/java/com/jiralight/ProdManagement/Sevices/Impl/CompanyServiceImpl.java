package com.jiralight.ProdManagement.Sevices.Impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.Repositories.CompanyRepository;
import com.jiralight.ProdManagement.Sevices.CompanyService;
import com.jiralight.ProdManagement.Sevices.UserService;
import com.jiralight.ProdManagement.dto.CompanyDTO;
import com.jiralight.ProdManagement.entities.Company;
import com.jiralight.ProdManagement.entities.User;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private UserService userService;

    public Company registerCompany(CompanyDTO companySignupDTO) {
        User adminUser = new User();
        adminUser.setUserName(companySignupDTO.getAdminUserName());
        adminUser.setUserEmail(companySignupDTO.getAdminUserEmail());
        adminUser.setUserPassword(companySignupDTO.getAdminUserPassword());
        adminUser.setUserMobile(companySignupDTO.getAdminUserMobile());
        adminUser.setAdmin(true);
        adminUser.setEmp(false);
        adminUser.setOtpVerified(false); // Assume OTP is verified for simplicity

        adminUser = userService.registerUser(adminUser);
        // Create a new company
        Company company = new Company();
        company.setCompanyName(companySignupDTO.getCompanyName());
        company.setEmpKey(companySignupDTO.getEmpKey());
        company.setAdminUser(adminUser);
        company.setCreatedOn(new Date());
        company.setLastLogin(new Date());
        companyRepository.save(company);
        
        // Associate the admin user with the company
        // adminUser.setCompany(company);
        // userService.registerUser(adminUser); // Update admin user with company association
        
        return company;
    }
}
