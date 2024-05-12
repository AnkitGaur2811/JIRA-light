package com.jiralight.ProdManagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stage_master")
public class Stage_master {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stageId;

    @Column(nullable = false)
    private String stageName;
    
}
