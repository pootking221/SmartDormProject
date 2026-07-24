package com.dormproject.smartDormProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dormproject.smartDormProject.repository.fileDTO.LoginRequest;
import com.dormproject.smartDormProject.entity.LoginResponse;
import com.dormproject.smartDormProject.entity.Roles;
import com.dormproject.smartDormProject.entity.Users;
import com.dormproject.smartDormProject.repository.fileDAO.RoleDAO;
import com.dormproject.smartDormProject.repository.fileDAO.UsersDAO;

@Service
public class AuthUser {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersDAO usersDAO;
    @Autowired
    private RoleDAO rolesDAO;


    public Users register(Users users){
        String encodePassword = passwordEncoder.encode(users.getPassword());
        users.setPassword(encodePassword);
        Roles role = rolesDAO.get(2);
        users.setRole(role);
        usersDAO.save(users);

        return users;
    }

    public LoginResponse login(LoginRequest request){
        Users user = usersDAO.findUsername(request.getUsername());
        LoginResponse response = new LoginResponse();
        if (user == null){
            throw new RuntimeException("not found user !!");
        }
        if(!passwordEncoder.matches(
            request.getPassword(), 
            user.getPassword())){
            
                throw new RuntimeException("user or password incorrect");
        }

        response.setUserid(user.getUserid());
        response.setUsername(user.getName());
        response.setGmail(user.getGmail());
        response.setRole(user.getRole().getRole_name());
        response.setMessage("Login Success!!");

        return  response;
    }
}
