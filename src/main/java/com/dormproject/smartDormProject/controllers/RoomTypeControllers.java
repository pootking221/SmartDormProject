package com.dormproject.smartDormProject.controllers;

import java.util.List;

import com.dormproject.smartDormProject.repository.fileDTO.RoomTypeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dormproject.smartDormProject.entity.ResponseBox;
import com.dormproject.smartDormProject.entity.RoomType;
import com.dormproject.smartDormProject.repository.fileDAO.RoomTypeDAO;

@RestController
@RequestMapping("/api/roomtype")
public class RoomTypeControllers {

    @Autowired
    private RoomTypeDAO roomTypeDAO;

    @PostMapping("/create")
    public ResponseEntity<ResponseBox> insetRoom(@RequestBody RoomTypeRequest request){
        ResponseBox response = roomTypeDAO.insertRoom(request);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseBox> deleteRoom(@PathVariable Integer id){
        ResponseBox response = roomTypeDAO.deleteRoom(id);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @GetMapping
    public List<RoomType> getRoomAll(){
        return roomTypeDAO.getAllRoom();
    }

    @GetMapping("get/{id}")
    public RoomType getId(@PathVariable Integer id){
        return roomTypeDAO.getId(id);
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseBox> updateRoom(@RequestBody RoomTypeRequest request){
        ResponseBox response = roomTypeDAO.updateRoom(request);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }
}
