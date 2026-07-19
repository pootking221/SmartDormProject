package com.dormproject.smartDormProject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dormproject.smartDormProject.entity.Dorms;
import com.dormproject.smartDormProject.entity.ResponseBox;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public class DormsRepository implements DormsDAO{

    private final EntityManager entityManager;
    private ResponseBox responseBox;

    @Autowired
    public DormsRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public ResponseBox insert(Dorms dorms) {

        entityManager.persist(dorms);
        Dorms dorm = entityManager.find(Dorms.class, dorms.getDormid());
        if(dorm != null){
            responseBox.setMessage("Insert success!!");
            responseBox.setStatusCode(201);
        }else{
            responseBox.setMessage("Unauthorized");
            responseBox.setStatusCode(401);
        }

        return responseBox;
       
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Dorms getDorms(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Dorms> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Dorms dorms) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
