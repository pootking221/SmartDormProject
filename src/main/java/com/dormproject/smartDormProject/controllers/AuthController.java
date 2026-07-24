package com.dormproject.smartDormProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dormproject.smartDormProject.AuthUser;
import com.dormproject.smartDormProject.repository.fileDTO.LoginRequest;
import com.dormproject.smartDormProject.entity.LoginResponse;
import com.dormproject.smartDormProject.entity.Users;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthUser authUser;

    @PostMapping("/register")
    public Users register(@RequestBody Users users) {
        return authUser.register(users);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){
        return authUser.login(request);
    }
}
