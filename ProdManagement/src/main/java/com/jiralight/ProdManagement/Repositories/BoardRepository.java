package com.jiralight.ProdManagement.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiralight.ProdManagement.entities.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
    
}
