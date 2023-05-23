package com.geekster.H2fun.controller;

import com.geekster.H2fun.models.Users;
import com.geekster.H2fun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userservice;
    //Get
    @GetMapping(value = "/users")
    public Iterable<Users> getUsers()
    {
        return userservice.getAllUsers();
    }
    //Post
    @PostMapping(value = "/users")
    public String insertUsers(@RequestBody List<Users> userList) {
        return userservice.addUsers(userList);
    }

    //Delete
    @DeleteMapping(value = "/user/{id}")
    public void deleteUserbyId(@PathVariable Integer id){
        userservice.removeUserById(id);
    }

}
