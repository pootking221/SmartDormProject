package com.dormproject.smartDormProject;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dormproject.smartDormProject.entity.Roles;
import com.dormproject.smartDormProject.entity.Users;
import com.dormproject.smartDormProject.repository.RoleDAO;
import com.dormproject.smartDormProject.repository.UsersDAO;

@SpringBootApplication
public class SmartDormProjectApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SmartDormProjectApplication.class, args);
    }

    // @Bean
    // CommandLineRunner commandLineRunner(UsersDAO dao, RoleDAO roleDAO) {
    //     return args -> {
    //     //  insertData(dao,roleDAO);
    //     };
    // }

    public void insertData(UsersDAO dao, RoleDAO roleDAO){
        Roles role = roleDAO.get(1);
        Users user = new Users("Admin", "Admin222@gmail.com", "3242424", "dadadsfq3", "17/7/69", role);
        dao.save(user);
        System.out.println("Insert Complete");
    }

    public void deleteData(UsersDAO dao){
        int id=1;
        dao.delete(id);
        System.out.println("Delete confrim");
    }

    public void getData(UsersDAO dao){
        int id =3;
        Users user = dao.get(id);
        System.out.println(user);
    }

    public void getAllData(UsersDAO dao){
        List<Users> data = dao.getAll();
        for (Users user : data) {
            System.out.println(user);
        }
        
    }
    public void updateData(UsersDAO dao){
        int id = 3;
        Users user = dao.get(id);
        System.out.println(user);
        user.setName("DomeDome");
        user.setTelphone("000000000");
        dao.update(user);
        System.out.println("Update conplete");
    }


}
