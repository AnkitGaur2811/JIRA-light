package com.jiralight.ProdManagement.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Company {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long companyId;

@Column(nullable = false)
private String companyName;

@Column(nullable = false,unique = true)
private String adminEmail;

@Column(nullable = false)
private String adminPassword;

@Column(nullable = false,unique = true)
private String empKey;

@Column(nullable = false)
private String companyMobile;

@Column(nullable = false)
private Date createdOn;

@Column(nullable = false)
private Date lastLogin;

@Override
public String toString() {
    return "Company [companyId=" + companyId + ", companyName=" + companyName + ", adminEmail=" + adminEmail
            + ", adminPassword=" + adminPassword + ", empKey=" + empKey + ", companyMobile=" + companyMobile
            + ", createdOn=" + createdOn + ", lastLogin=" + lastLogin + "]";
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

public String getAdminEmail() {
    return adminEmail;
}

public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
}

public String getAdminPassword() {
    return adminPassword;
}

public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
}

public String getEmpKey() {
    return empKey;
}

public void setEmpKey(String empKey) {
    this.empKey = empKey;
}

public String getCompanyMobile() {
    return companyMobile;
}

public void setCompanyMobile(String companyMobile) {
    this.companyMobile = companyMobile;
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
