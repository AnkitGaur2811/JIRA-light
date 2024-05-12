package com.jiralight.ProdManagement.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false, unique = true)
    private String userEmail;

    @Column(nullable = false)
    private String userPassword;

    @Column(nullable = false)
    private boolean isEmp;

    @Column(nullable = false)
    private boolean isAdmin;

    @Column(nullable = true)
    private Long companyId;

    @Column(nullable = false, unique = true)
    private String userMobile;

    @Column(nullable = false)
    private Date createdOn;

    @Column(nullable = false)
    private Date lastLogin;

    @Override
    public String toString() {
        return "User [userId=" + userId + ", UserName=" + userName + ", UserEmail=" + userEmail + ", UserPassword="
                + userPassword + ", isEmp=" + isEmp + ", isAdmin=" + isAdmin + ", companyId=" + companyId + ", userMobile=" + userMobile
                + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + "]";
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isEmp() {
        return isEmp;
    }

    public void setEmp(boolean isEmp) {
        this.isEmp = isEmp;
    }

    public boolean isAdmin() {
        return isEmp;
    }

    public void setAdmin(boolean isEmp) {
        this.isEmp = isEmp;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    
}
