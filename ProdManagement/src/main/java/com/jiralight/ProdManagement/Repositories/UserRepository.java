package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsByUserEmail(String userEmail);
    User findByUserEmail(String userEmail);
    User findByUserId(Long userId);
    boolean findByUserName(String userName);


    
} 
