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
@Table(name = "otpVerification")
public class OTP_verfication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mobileNumber;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(nullable = false)
    private String otp;

    @Column(nullable = false)
    private boolean isVerified;

    @Column(nullable = false)
    private Date updatedOn;

    @ManyToOne
    @JoinColumn(name = "updatedBy", nullable = false)
    private User updatedBy;

    // Constructors
    public OTP_verfication() {
    }

    public OTP_verfication(String mobileNumber, User user, String otp, boolean isVerified, Date updatedOn,
            User updatedBy) {
        this.mobileNumber = mobileNumber;
        this.user = user;
        this.otp = otp;
        this.isVerified = isVerified;
        this.updatedOn = updatedOn;
        this.updatedBy = updatedBy;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
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

    public User getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return "OtpVerification [id=" + id + ", mobileNumber=" + mobileNumber + ", user=" + user + ", otp=" + otp
                + ", isVerified=" + isVerified + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy + "]";
    }

}