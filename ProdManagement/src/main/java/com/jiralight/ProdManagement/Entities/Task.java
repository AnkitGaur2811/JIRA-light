package com.jiralight.ProdManagement.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
    
    @ManyToOne
    @JoinColumn(name = "assigneeId", nullable = false)
    private User assigneeId;
    
    @ManyToOne
    @JoinColumn(name = "boardId", nullable = false)
    private Board boardId;
    
    @Column(nullable = false)
    private Date createdOn;
    
    @ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
    private User createdBy;
    
    @Column(nullable = false)
    private Date updatedOn;
    
    @ManyToOne
    @JoinColumn(name = "updatedBy", nullable = false)
    private User updatedBy;
    
    @ManyToOne
    @JoinColumn(name = "stageId", nullable = false)
    private Stage_master stageId;
    
    @Column(nullable = false)
    private Date dueDate;

    public Task() {
    }

    public Task(Long taskId, String summary, String description, User assigneeId, Board boardId, Date createdOn,
            User createdBy, Date updatedOn, User updatedBy, Stage_master stageId, Date dueDate) {
        this.taskId = taskId;
        this.summary = summary;
        this.description = description;
        this.assigneeId = assigneeId;
        this.boardId = boardId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
        this.stageId = stageId;
        this.dueDate = dueDate;
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

    public User getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(User assigneeId) {
        this.assigneeId = assigneeId;
    }

    public Board getBoardId() {
        return boardId;
    }

    public void setBoardId(Board boardId) {
        this.boardId = boardId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Stage_master getStageId() {
        return stageId;
    }

    public void setStageId(Stage_master stageId) {
        this.stageId = stageId;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + ", summary=" + summary + ", description=" + description + ", assigneeId="
                + assigneeId.toString() + ", boardId=" + boardId + ", createdOn=" + createdOn + ", createdBy=" + createdBy.toString()
                + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy.toString() + ", stageId=" + stageId.toString() + ", dueDate="
                + dueDate + "]";
    }
    
    

}