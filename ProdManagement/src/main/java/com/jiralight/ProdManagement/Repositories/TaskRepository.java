package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {
    
}
