package com.dormproject.smartDormProject.repository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dormproject.smartDormProject.entity.Roles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class RoleRepository implements RoleDAO{

    private final EntityManager entityManager;

    @Autowired
    public RoleRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    } 

    @Override
    @Transactional
    public void save(Roles role) {
        entityManager.persist(role);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Roles role = entityManager.find(Roles.class, id);
        entityManager.remove(role);

    }

    @Override
    public Roles get(Integer id) {
        Roles role = entityManager.find(Roles.class, id);
        return role;
    }

    @Override
    public List<Roles> getAll() {
        TypedQuery<Roles> query = entityManager.createQuery("FROM Roles", Roles.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(Roles role) {
       entityManager.merge(role);
    }

}
