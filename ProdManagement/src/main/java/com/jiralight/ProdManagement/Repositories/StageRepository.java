package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.Stage_master;

public interface StageRepository extends JpaRepository<Stage_master,Long>{
    
}
