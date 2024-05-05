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
    private String UserName;

    @Column(nullable = false, unique = true)
    private String UserEmail;

    @Column(nullable = false)
    private String UserPassword;

    @Column(nullable = false)
    private boolean isEmp;

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
        return "User [userId=" + userId + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserPassword="
                + UserPassword + ", isEmp=" + isEmp + ", companyId=" + companyId + ", userMobile=" + userMobile
                + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + "]";
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public boolean isEmp() {
        return isEmp;
    }

    public void setEmp(boolean isEmp) {
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
