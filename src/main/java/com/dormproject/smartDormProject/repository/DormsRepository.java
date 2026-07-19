package com.dormproject.smartDormProject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dormproject.smartDormProject.entity.Dorms;
import com.dormproject.smartDormProject.entity.ResponseBox;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Repository
public class DormsRepository implements DormsDAO{

    private final EntityManager entityManager;
    private final ResponseBox responseBox = new ResponseBox();

    @Autowired
    public DormsRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public ResponseBox insert(Dorms dorms) {

        
        try {
            entityManager.persist(dorms);

            responseBox.setStatusCode(200);
            responseBox.setMessage("Insert Success");

        } catch (Exception e) {

            responseBox.setStatusCode(500);
            responseBox.setMessage(e.getMessage());

        }

        return responseBox;
    }

    @Override
    @Transactional
    public ResponseBox delete(Integer id) {

        try {

            Dorms dorm = entityManager.find(Dorms.class, id);

            if(dorm != null){
                entityManager.remove(dorm);
                responseBox.setMessage("Delete success!!");
                responseBox.setStatusCode(200);
            }else {
                responseBox.setMessage("not found dorm.");
                responseBox.setStatusCode(200);
            }

        }catch(Exception e){
            responseBox.setStatusCode(500);
            responseBox.setMessage(e.getMessage());
        }
       
        return responseBox;

    }

    @Override
    public Dorms getDorms(Integer id) {
        Dorms dorm = new Dorms();
         
        try {
             dorm = entityManager.find(Dorms.class, id);  
        } catch (Exception e) {
            responseBox.setMessage(e.getMessage());
            responseBox.setStatusCode(500);
        }

        return  dorm;
        
        
    }

    @Override
    public List<Dorms> getAll() {
      
        TypedQuery<Dorms>query = entityManager.createQuery("FROM Dorms", Dorms.class);
        return query.getResultList();
       
    }

    @Override
    @Transactional
    public ResponseBox update(Dorms dorms) {
        try {
            entityManager.merge(dorms);
            responseBox.setMessage("Update success!!");
            responseBox.setStatusCode(200);
        } catch (Exception e) {
            responseBox.setMessage(e.getMessage());
            responseBox.setStatusCode(500);
        }

        return responseBox;
       
    }

}
