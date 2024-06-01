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
    private List<Task> tasks;

    @OneToMany(mappedBy = "user")
    private List<OTP_verfication> otps;

    @OneToMany(mappedBy = "ownerId")
    private List<Board> boards;

    @Column(nullable = false)
    private boolean otpVerified;

    public User() {}

    public User(Long userId, String userName, String userEmail, String userPassword, boolean isEmp, boolean isAdmin,
            String userMobile, Date createdOn, Date lastLogin, Company company, List<Task> tasks,
            List<OTP_verfication> otps, List<Board> boards, boolean otpVerified) {
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
        this.tasks = tasks;
        this.otps = otps;
        this.boards = boards;
        this.otpVerified = otpVerified;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
                + userPassword + ", isEmp=" + isEmp + ", isAdmin=" + isAdmin + ", userMobile=" + userMobile
                + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + ", company=" + company.toString() + ", tasks=" + tasks
                + ", otps=" + otps + ", boards=" + boards + ", otpVerified=" + otpVerified + "]";
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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<OTP_verfication> getOtps() {
        return otps;
    }

    public void setOtps(List<OTP_verfication> otps) {
        this.otps = otps;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public boolean isOtpVerified() {
        return otpVerified;
    }

    public void setOtpVerified(boolean otpVerified) {
        this.otpVerified = otpVerified;
    }

    
}
