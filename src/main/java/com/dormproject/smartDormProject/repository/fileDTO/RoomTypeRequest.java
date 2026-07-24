package com.dormproject.smartDormProject.repository.fileDTO;

public class RoomTypeRequest {
    private Integer room_type_id;
    private String roomname;
    private Float price;
    private Integer available;
    private String funiture;
    private Integer dormid;
    private String size;

    public RoomTypeRequest(Integer room_type_id, String size, String roomname, Float price, Integer available, String funiture, Integer dormid) {
        this.room_type_id = room_type_id;
        this.roomname = roomname;
        this.price = price;
        this.available = available;
        this.funiture = funiture;
        this.dormid = dormid;
        this.size = size;
    }
    public RoomTypeRequest(){}

    public Integer getRoomID() {
        return room_type_id;
    }

    public void setRoomID(Integer room_type_id) {
        this.room_type_id = room_type_id;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public String getFuniture() {
        return funiture;
    }

    public void setFuniture(String funiture) {
        this.funiture = funiture;
    }

    public Integer getDormid() {
        return dormid;
    }

    public void setDormid(Integer dormid) {
        this.dormid = dormid;
    }
}
