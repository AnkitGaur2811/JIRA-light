package com.jiralight.ProdManagement.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    
    @Column(nullable = false, unique = true)
    private String userMobile;
    
    @Column(nullable = false)
    private Date createdOn;
    
    @Column(nullable = false)
    private Date lastLogin;

    @ManyToOne
    @JoinColumn(name = "companyId", nullable = true)
    private Company company;

    @OneToMany(mappedBy = "assigneeId")
    private List<Task> assignedTasks;

    @OneToMany(mappedBy = "ownerId")
    private List<Board> ownedBboards;

    @Column(nullable = false)
    private boolean otpVerified;

    @Column(nullable = true)
    private String EMPkey;

    
    public User() {}
    
    
    public User(Long userId, String userName, String userEmail, String userPassword, boolean isEmp, boolean isAdmin,
            String userMobile, Date createdOn, Date lastLogin, Company company, List<Task> assignedTasks,
            List<Board> ownedBboards, boolean otpVerified) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.isEmp = isEmp;
        this.isAdmin = isAdmin;
        this.userMobile = userMobile;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
        this.company = company;
        this.assignedTasks = assignedTasks;
        this.ownedBboards = ownedBboards;
        this.otpVerified = otpVerified;
    }


    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
                + userPassword + ", isEmp=" + isEmp + ", isAdmin=" + isAdmin + ", userMobile=" + userMobile
                + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + ", company=" + company + ", assignedTasks="
                + assignedTasks + ", ownedBboards=" + ownedBboards + ", otpVerified=" + otpVerified + "]";
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
        return isAdmin;
    }


    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
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


    public Company getCompany() {
        return company;
    }


    public void setCompany(Company company) {
        this.company = company;
    }


    public List<Task> getAssignedTasks() {
        return assignedTasks;
    }
    
    
    public void setAssignedTasks(List<Task> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    
    public List<Board> getOwnedBboards() {
        return ownedBboards;
    }


    public void setOwnedBboards(List<Board> ownedBboards) {
        this.ownedBboards = ownedBboards;
    }


    public boolean isOtpVerified() {
        return otpVerified;
    }

    
    public void setOtpVerified(boolean otpVerified) {
        this.otpVerified = otpVerified;
    }
    
    public String getEMPkey() {
        return EMPkey;
    }


    public void setEMPkey(String eMPkey) {
        EMPkey = eMPkey;
    }
    
    
}
