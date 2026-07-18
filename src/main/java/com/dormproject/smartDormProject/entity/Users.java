package com.dormproject.smartDormProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userid;

    @Column(name = "name")
    private String name;
    @Column(name = "gmail")
    private String gmail;
    @Column(name = "telphone")
    private String telphone;
    @Column(name = "password")
    private String password;
    @Column(name = "create_at")
    private String create_at;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;
   

    public Users(String name, String gmail, String telphone, String password, String create_at, Roles role ) {
      
        this.name = name;
        this.gmail = gmail;
        this.telphone = telphone;
        this.password = password;
        this.create_at = create_at;
        this.role = role;
    }

    public Users(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setGmail(String gmail){
        this.gmail = gmail;
    }
    public String getGmail(){
        return this.gmail;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return this.password;
    }
    public void setTelphone(String tel){
        this.telphone = tel;
    }
    public String getTelphone(){
        return this.telphone;
    }
    public void setCreate_at(String at){
        this.create_at = at;
    }
    public String getCreate_at(){
        return this.create_at;
    }

     public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString(){
        return "{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                ", telphone='" + telphone + '\'' +
                ", create_at='" + create_at + '\'' +
                '}';
    }

   
    
}
