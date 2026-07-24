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
@Table(name = "roomtype")
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_type_id")
    private Integer room_type_id;

    @Column(name="roomname")
    private String roomname;

    @Column(name="price")
    private float price;

    @Column(name="available")
    private Integer available;

    @Column(name="size")
    private String size;

    @Column(name="funiture")
    private String funiture;

    @ManyToOne
    @JoinColumn(name="dormid")
    private Dorms dormid;

    public RoomType() {

    }
    public RoomType(Integer room_type_id, String roomname, float price, Integer available, String size, String funiture, Dorms dormid ){
        this.room_type_id = room_type_id;
        this.roomname = roomname;
        this.price = price;
        this.available = available;
        this.size = size;
        this.funiture = funiture;
        this.dormid = dormid;
    }
    
    public Integer getRoom_type_id() {
        return room_type_id;
    }
    public void setRoom_type_id(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }
    public String getRoomname() {
        return roomname;
    }
    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Integer getAvailable() {
        return available;
    }
    public void setAvailable(Integer available) {
        this.available = available;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getFuniture() {
        return funiture;
    }
    public void setFuniture(String funiture) {
        this.funiture = funiture;
    }
    public Dorms getDormid() {
        return dormid;
    }
    public void setDormid(Dorms dormid) {
        this.dormid = dormid;
    }
    @Override
    public String toString() {
        return "RoomType = {room_type_id=" + room_type_id + ", roomname=" + roomname + ", price=" + price + ", available="
                + available + ", size=" + size + ", funiture=" + funiture + ", dormid=" + dormid + "}";
    }



}
