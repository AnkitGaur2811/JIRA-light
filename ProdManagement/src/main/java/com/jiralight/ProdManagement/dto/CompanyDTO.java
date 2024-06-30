package com.jiralight.ProdManagement.dto;

public class CompanyDTO {
    private String companyName;
    private String empKey;
    private String adminUserName;
    private String adminUserEmail;
    private String adminUserPassword;
    private String adminUserMobile;

    public CompanyDTO(String companyName, String empKey, String adminUserName, String adminUserEmail,
            String adminUserPassword, String adminUserMobile) {
        this.companyName = companyName;
        this.empKey = empKey;
        this.adminUserName = adminUserName;
        this.adminUserEmail = adminUserEmail;
        this.adminUserPassword = adminUserPassword;
        this.adminUserMobile = adminUserMobile;
    }
    public String getCompanyName() {
        return companyName;
    }
    public String getEmpKey() {
        return empKey;
    }
    public String getAdminUserName() {
        return adminUserName;
    }
    public String getAdminUserEmail() {
        return adminUserEmail;
    }
    public String getAdminUserPassword() {
        return adminUserPassword;
    }
    public String getAdminUserMobile() {
        return adminUserMobile;
    }
    
    @Override
    public String toString() {
        return "CompanyDTO [companyName=" + companyName + ", empKey=" + empKey + ", adminUserName=" + adminUserName
                + ", adminUserEmail=" + adminUserEmail + ", adminUserPassword=" + adminUserPassword
                + ", adminUserMobile=" + adminUserMobile + "]";
    }
    
    
}
