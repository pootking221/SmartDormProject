package com.dormproject.smartDormProject.repository;
import java.util.List;

import com.dormproject.smartDormProject.entity.Users;

public interface UsersDAO {
    void save(Users users);
    void delete(Integer id);
    Users get(Integer userid);
    List<Users> getAll();
    void update(Users users);
    Users findUsername(String users);
}
