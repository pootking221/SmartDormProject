package com.dormproject.smartDormProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dorms")
public class Dorms {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="dormid")
    private Integer dormid;

    @Column(name="dormname")
    private String dormname;

    @Column(name="telphone")
    private String telphone;

    @Column(name="latitude")
    private float latitude;

    @Column(name="longitude")
    private float longitude;

    @Column(name="deposit")
    private Integer deposit;

    @Column(name="description")
    private String description;

    public Dorms(Integer dormid, String dormname, String telphone, float latitude, float longitude, Integer deposit,
            String description) {
        this.dormid = dormid;
        this.dormname = dormname;
        this.telphone = telphone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deposit = deposit;
        this.description = description;
    }

  
    public Dorms() {
    }

    
    public Integer getDormid() {
        return dormid;
    }
    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }
    public String getDormname() {
        return dormname;
    }
    public void setDormname(String dormname) {
        this.dormname = dormname;
    }
    public String getTelphone() {
        return telphone;
    }
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public float getLongitude() {
    return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    public Integer getDeposit() {
        return deposit;
    }
    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Dorms = {dormid=" + dormid + ", dormname=" + dormname + ", telphone=" + telphone + ", latitude="
                + latitude + ", longitude=" + longitude + ", deposit=" + deposit + ", description=" + description
                + "}";
    }

    
}
