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
@Table(name = "otpVerification")
public class OTP_verfication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String mobileNumber;

    @Column(nullable = false)@ManyToOne
    private Long userId;

    @Column(nullable = false)
    private String OTP;

    @Column(nullable = false)
    private boolean isVerified;

    @Column(nullable = false)
    private Date updatedOn;
    
    @Column(nullable = false)
    private Long updatedBy;

    @Override
    public String toString() {
        return "OTP_verfication [Id=" + Id + ", mobileNumber=" + mobileNumber + ", userId=" + userId + ", OTP=" + OTP
                + ", isVerified=" + isVerified + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy + "]";
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String oTP) {
        OTP = oTP;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
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

    
}
