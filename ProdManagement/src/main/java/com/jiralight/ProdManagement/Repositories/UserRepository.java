package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.User;
import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long>{

    boolean existsByUserEmail(String userEmail);
    User findByUserId(Long userId);
    boolean findByUserName(String userName);
    Optional<User> findByUserEmail(String userEmail);
    Optional<User> findByUserMobile(String userMobile);


    
} 
