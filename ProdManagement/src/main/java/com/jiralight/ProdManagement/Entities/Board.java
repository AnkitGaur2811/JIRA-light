package com.jiralight.ProdManagement.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "board")
public class Board {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @Column(nullable = false)
    private boolean isPersonal; 

    @Column(nullable = false)@ManyToOne
    private Long ownerId;

    @Column(nullable = false)
    private Date createdOn;

    @Column(nullable = false)
    private Long createdBy;

    @Column(nullable = false)
    private Date updatedOn;
    
    @Column(nullable = false)
    private Long updatedBy;
    
    @Column(nullable = false)
    private List<Long> stageList; 
    
    @Override
    public String toString() {
        return "Board [boardId=" + boardId + ", isPersonal=" + isPersonal + ", ownerId=" + ownerId + ", createdOn="
                + createdOn + ", createdBy=" + createdBy + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy
                + ", stageList= " + stageList + "]";
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public boolean isPersonal() {
        return isPersonal;
    }

    public void setPersonal(boolean isPersonal) {
        this.isPersonal = isPersonal;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public List<Long> getStageList() {
        return stageList;
    }

    public void setStageList(List<Long> stageList) {
        this.stageList = stageList;
    }

    
}
