package com.dormproject.smartDormProject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dormproject.smartDormProject.entity.Users;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class UsersRepository implements UsersDAO {

   
    private final EntityManager entityManager;
   
   @Autowired
    public UsersRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Users users) {
        entityManager.persist(users);
    }

    @Override
    @Transactional
    public void delete(Integer userid){
        Users users = entityManager.find(Users.class, userid);
        entityManager.remove(users);
    }

    @Override
    public Users get(Integer userid) {
        return entityManager.find(Users.class, userid);
    }

    @Override
    public List<Users> getAll() {
        TypedQuery<Users> query = entityManager.createQuery("FROM  Users", Users.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Users users) {
        entityManager.merge(users);
    }

   

   
}
