package com.jiralight.ProdManagement.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    @ManyToOne
    @JoinColumn(name = "ownerId", nullable = false)
    private User ownerId;

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
    
     @ManyToMany
    @JoinTable(
        name = "board_stages",
        joinColumns = @JoinColumn(name = "boardId"),
        inverseJoinColumns = @JoinColumn(name = "stageId")
    )
    private List<Stage_master> stageList;

    public Board() {
    }

    public Board(Long boardId, boolean isPersonal, User ownerId, Date createdOn, User createdBy, Date updatedOn,
            User updatedBy, List<Stage_master> stageList) {
        this.boardId = boardId;
        this.isPersonal = isPersonal;
        this.ownerId = ownerId;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
        this.stageList = stageList;
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

    public User getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(User ownerId) {
        this.ownerId = ownerId;
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

    public List<Stage_master> getStageList() {
        return stageList;
    }

    public void setStageList(List<Stage_master> stageList) {
        this.stageList = stageList;
    }

    @Override
    public String toString() {
        return "Board [boardId=" + boardId + ", isPersonal=" + isPersonal + ", ownerId=" + ownerId.toString() + ", createdOn="
                + createdOn + ", createdBy=" + createdBy.toString() + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy.toString()
                + ", stageList=" + stageList + "]";
    } 
    
    
}
