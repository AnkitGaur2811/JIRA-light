package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsByEmail(String userEmail);

    
} 
