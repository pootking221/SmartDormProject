package com.dormproject.smartDormProject.repository.fileDAO;

import com.dormproject.smartDormProject.entity.ResponseBox;
import com.dormproject.smartDormProject.entity.RoomType;
import com.dormproject.smartDormProject.repository.fileDTO.RoomTypeRequest;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoomTypeDAO {
    ResponseBox insertRoom(RoomTypeRequest roomTypeRequest);
    ResponseBox deleteRoom(Integer id);
    RoomType getId(Integer id);
    List<RoomType> getAllRoom();
    ResponseBox updateRoom(RoomTypeRequest roomTypeRequest);
}
