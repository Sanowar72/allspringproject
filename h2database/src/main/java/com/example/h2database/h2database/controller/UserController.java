package com.example.h2database.h2database.controller;

import com.example.h2database.h2database.model.Users;
import com.example.h2database.h2database.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @GetMapping(value = "/home")
    public String home(){
        return "this is home and its only for testing routes";
    }
    @Autowired
    UserServices userServices;

//    get all users........
    @GetMapping(value = "/allUser")
    public Iterable<Users> getall(){
        return userServices.getll();
    }

//    add user.........
    @PostMapping(value = "/users")
    public String addusers(@RequestBody List<Users> users){
        return userServices.addusers(users);
    }
//find user by id......
    @GetMapping(value = "/userbyid/{id}")
    public Optional<Users> userbyid(@PathVariable Long id){
        return userServices.userbyid(id);
    }
//find by title.....

    @GetMapping(value = "/title/{title}")
    public List<Users> findbytitle(@PathVariable String title){
        return userServices.findbytitle(title);
    }


//    delete user based on id......

    @DeleteMapping(value = "/delete/{id}")
    public String deletebyid(@PathVariable Long id){
        return userServices.deletebyid(id);
    }
}
