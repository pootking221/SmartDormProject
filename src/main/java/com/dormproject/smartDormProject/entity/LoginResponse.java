package com.dormproject.smartDormProject.entity;

public class LoginResponse {
    private int userid;
    private String username;
    private String gmail;
    private String token;
    private String message;
    private String role;
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getusername() {
        return username;
    }
    public void setusername(String username) {
        this.username = username;
    }
    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "LoginResponse {userid=" + userid + ", username=" + username + ", gmail=" + gmail + ", token=" + token
                + ", message=" + message + ", role=" + role + "}";
    }
}
