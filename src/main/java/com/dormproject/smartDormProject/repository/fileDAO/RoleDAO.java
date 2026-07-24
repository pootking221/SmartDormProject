package com.dormproject.smartDormProject.repository.fileDAO;

import java.util.List;

import com.dormproject.smartDormProject.entity.Roles;


public interface RoleDAO {
    void save(Roles role);
    void delete(Integer id);
    Roles get(Integer id);
    List<Roles> getAll();
    void update(Roles role);
    
}
