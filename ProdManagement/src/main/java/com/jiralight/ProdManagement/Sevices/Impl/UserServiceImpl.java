package com.jiralight.ProdManagement.Sevices.Impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jiralight.ProdManagement.Repositories.CompanyRepository;
import com.jiralight.ProdManagement.Repositories.UserRepository;
import com.jiralight.ProdManagement.Sevices.UserService;
import com.jiralight.ProdManagement.dto.UserDTO;
import com.jiralight.ProdManagement.entities.Company;
import com.jiralight.ProdManagement.entities.User;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerNewUser(UserDTO userRegistrationDto) {
        User user = new User();
        user.setUserName(userRegistrationDto.getUserName());
        user.setUserEmail(userRegistrationDto.getUserEmail());
        user.setUserPassword(passwordEncoder.encode(userRegistrationDto.getUserPassword()));
        user.setUserMobile(userRegistrationDto.getUserMobile());
        user.setEmp(userRegistrationDto.isEmp());
        user.setAdmin(false);
        user.setOtpVerified(false);
        user.setCreatedOn(new Date());
        user.setLastLogin(new Date());

        if (userRegistrationDto.isEmp() && userRegistrationDto.getEMPkey() != null) {
            Company company = companyRepository.findByEmpKey(userRegistrationDto.getEMPkey());
            if (company != null) {
                user.setCompany(company);
            }
        }

        return userRepository.save(user);
    }

    @Override
    public User registerUser(User user){
        User usernew = new User();
        usernew.setUserName(user.getUserName());
        usernew.setUserEmail(user.getUserEmail());
        usernew.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
        usernew.setUserMobile(user.getUserMobile());
        usernew.setAdmin(user.isAdmin());
        usernew.setEmp(false);
        usernew.setOtpVerified(false);
        usernew.setCreatedOn(new Date());
        usernew.setLastLogin(new Date());

        if (usernew.isEmp() && usernew.getEMPkey() != null) {
            Company company = companyRepository.findByEmpKey(user.getEMPkey());
            if (company != null) {
                user.setCompany(company);
            }
        }

        return userRepository.save(usernew);
    }


}
