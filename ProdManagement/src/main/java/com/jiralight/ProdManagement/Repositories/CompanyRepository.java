package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    
}
