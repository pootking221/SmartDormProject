package com.dormproject.smartDormProject.repository;

import com.dormproject.smartDormProject.entity.Dorms;
import com.dormproject.smartDormProject.entity.ResponseBox;
import com.dormproject.smartDormProject.entity.RoomType;
import com.dormproject.smartDormProject.repository.fileDAO.RoomTypeDAO;
import com.dormproject.smartDormProject.repository.fileDTO.RoomTypeRequest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomTypeRepository implements RoomTypeDAO {

    private final EntityManager entityManager;



    @Autowired
    public RoomTypeRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public ResponseBox insertRoom(RoomTypeRequest request) {

        ResponseBox response = new ResponseBox();

        Dorms dorm = entityManager.find(Dorms.class, request.getDormid());

        if (dorm == null) {
            response.setStatusCode(404);
            response.setMessage("Dorm not found");
            return response;
        }

        RoomType room = new RoomType();
        room.setRoomname(request.getRoomname());
        room.setPrice(request.getPrice());
        room.setAvailable(request.getAvailable());
        room.setSize(request.getSize());
        room.setFuniture(request.getFuniture());
        room.setDormid(dorm);

        entityManager.persist(room);

        response.setStatusCode(201);
        response.setMessage("Insert Success");

        return response;
    }

    @Override
    @Transactional
    public ResponseBox deleteRoom(Integer id) {
        ResponseBox response = new ResponseBox();
        RoomType roomType = entityManager.find(RoomType.class, id);

        try{
            if(roomType != null){
                entityManager.remove(roomType);
                response.setMessage("delete success!!");
                response.setStatusCode(200);
            }else{
                response.setMessage("not found room type!");
                response.setStatusCode(200);
            }

        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setStatusCode(500);
        }


        return response;
    }

    @Override
    public RoomType getId(Integer id) {

        return entityManager.find(RoomType.class, id);
    }

    @Override
    public List<RoomType> getAllRoom() {
        TypedQuery<RoomType> query = entityManager.createQuery("FROM RoomType", RoomType.class);
        return query.getResultList();

    }


    @Override
    @Transactional
    public ResponseBox updateRoom(RoomTypeRequest request) {

        ResponseBox response = new ResponseBox();

        try {

            RoomType room = entityManager.find(RoomType.class, request.getRoomID());

            if (room == null) {
                response.setMessage("Room type not found");
                response.setStatusCode(404);
                return response;
            }

            Dorms dorm = entityManager.find(Dorms.class, request.getDormid());

            if (dorm == null) {
                response.setMessage("Dorm not found");
                response.setStatusCode(404);
                return response;
            }

            room.setRoomname(request.getRoomname());
            room.setPrice(request.getPrice());
            room.setAvailable(request.getAvailable());
            room.setSize(request.getSize());
            room.setFuniture(request.getFuniture());
            room.setDormid(dorm);

            entityManager.merge(room);

            response.setMessage("Update success");
            response.setStatusCode(200);

        } catch (Exception e) {
            response.setMessage(e.getMessage());
            response.setStatusCode(500);
        }

        return response;
    }




}
