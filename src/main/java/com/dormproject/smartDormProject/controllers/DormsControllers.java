package com.dormproject.smartDormProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dormproject.smartDormProject.entity.Dorms;
import com.dormproject.smartDormProject.entity.ResponseBox;
import com.dormproject.smartDormProject.repository.DormsDAO;

@RestController
@RequestMapping("/api/dorms")
public class DormsControllers {
    @Autowired
    private DormsDAO dormsDAO;



    @PostMapping("/create")
    public ResponseBox insert(@RequestBody Dorms dorms){

        return dormsDAO.insert(dorms);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseBox delete(@PathVariable Integer id){
        return dormsDAO.delete(id);
    }

    @GetMapping
    public List<Dorms> getAll(){
        return dormsDAO.getAll();
    }

    @GetMapping("/{id}")
    public Dorms get(@PathVariable Integer id){
        return dormsDAO.getDorms(id);
    }

}
