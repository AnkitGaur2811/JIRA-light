package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.OTP_verfication;

public interface OtpRepository extends JpaRepository<OTP_verfication,Long> {
    
}
