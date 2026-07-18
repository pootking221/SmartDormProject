package com.dormproject.smartDormProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dormproject.smartDormProject.entity.Users;
import com.dormproject.smartDormProject.repository.UsersDAO;

@RestController
@RequestMapping("/api/users")
public class UsersControllers {

    @Autowired
    private UsersDAO userDAO;
 
   


    @GetMapping
    public List<Users> getAll(){
        return userDAO.getAll();
    }
    @GetMapping("/{id}")
    public Users get(@PathVariable Integer id){
        return userDAO.get(id);
    }
}
