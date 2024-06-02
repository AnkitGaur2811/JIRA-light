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
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(nullable = false)
    private String companyName;

    
    @Column(nullable = false, unique = true)
    private String empKey;
    
    @Column(nullable = false)
    private Date createdOn;
    
    @Column(nullable = false)
    private Date lastLogin;
    
    @ManyToOne
    @JoinColumn(name = "adminUserId", nullable = false, unique = true)
    private User adminUser;

    @OneToMany(mappedBy = "company")
    private List<User> employees;

    @OneToMany(mappedBy = "company")
    private List<Board> boards;

    public Company() {
    }

    public Company(Long companyId, String companyName, String empKey, Date createdOn, Date lastLogin, User adminUser,
            List<User> employees, List<Board> boards) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.empKey = empKey;
        this.createdOn = createdOn;
        this.lastLogin = lastLogin;
        this.adminUser = adminUser;
        this.employees = employees;
        this.boards = boards;
    }

    @Override
    public String toString() {
        return "Company [companyId=" + companyId + ", companyName=" + companyName + ", empKey=" + empKey
                + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + ", adminUser=" + adminUser + ", employees="
                + employees + ", boards=" + boards + "]";
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmpKey() {
        return empKey;
    }

    public void setEmpKey(String empKey) {
        this.empKey = empKey;
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

    public User getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(User adminUser) {
        this.adminUser = adminUser;
    }

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    
}