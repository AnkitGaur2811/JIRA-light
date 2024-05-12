package com.jiralight.ProdManagement.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "task")
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    
    @Column(nullable = false)
    private String summary;    
    
    @Column(nullable = true)
    private String description;
    
    @Column(nullable = false)@ManyToOne
    private Long assigneeId;
    
    @Column(nullable = false)@ManyToOne
    private Long boardId;
    
    @Column(nullable = false)
    private Date createdOn;
    
    @Column(nullable = false)
    private Long createdBy;
    
    @Column(nullable = false)
    private Date updatedOn;
    
    @Column(nullable = false)
    private Long updatedBy;
    
    @Column(nullable = false)@ManyToOne
    private Long stageId;
    
    @Column(nullable = false)
    private Date dueDate;
    

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + ", summary=" + summary + ", description=" + description + ", assigneeId="
                + assigneeId + ", createdOn=" + createdOn + ", createdBy=" + createdBy + ", updatedOn=" + updatedOn
                + ", updatedBy=" + updatedBy + ", stageId=" + stageId + ", dueDate=" + dueDate + ", boardId=" + boardId
                + "]";
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    
}
