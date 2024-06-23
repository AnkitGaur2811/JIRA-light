package com.jiralight.ProdManagement.dto;

public class UserDTO {
    
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userMobile;
    private boolean isEmp;
    private String EMPkey;

    
    public UserDTO(String userName, String userEmail, String userPassword, String userMobile, boolean isEmp,
            String eMPkey) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userMobile = userMobile;
        this.isEmp = isEmp;
        EMPkey = eMPkey;
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
    public String getUserMobile() {
        return userMobile;
    }
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
    public boolean isEmp() {
        return isEmp;
    }
    public void setEmp(boolean isEmp) {
        this.isEmp = isEmp;
    }
    public String getEMPkey() {
        return EMPkey;
    }
    public void setEMPkey(String eMPkey) {
        EMPkey = eMPkey;
    }
    @Override
    public String toString() {
        return "UserDTO [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
                + ", userMobile=" + userMobile + ", isEmp=" + isEmp + ", EMPkey=" + EMPkey + "]";
    }
    
}
