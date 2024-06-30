package com.jiralight.ProdManagement.Sevices;


import com.jiralight.ProdManagement.dto.CompanyDTO;
import com.jiralight.ProdManagement.entities.Company;

public interface CompanyService {
    Company registerCompany(CompanyDTO companySignupDTO);
    
}
