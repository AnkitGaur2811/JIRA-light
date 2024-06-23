package com.jiralight.ProdManagement.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {

    boolean existsByEmpKey(String randomString);

    Company findByEmpKey(String emPkey);
    
}
