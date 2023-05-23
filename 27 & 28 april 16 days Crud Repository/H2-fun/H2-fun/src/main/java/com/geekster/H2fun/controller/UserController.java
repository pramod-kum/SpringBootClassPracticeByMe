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

    //Get by name
    @GetMapping("/GetUserByName/{name}")
    public List<Users> getUserByName(@PathVariable String name){
        return userservice.fetchUserByName(name);
    }
    //Get age greater than
    @GetMapping("/GetUserGreaterThanAge/{age}")
    public List<Users> getUserByName(@PathVariable Integer age){
        return userservice.fetchUserGreaterByAgeFactor(age);
    }
    //Or name somethin or get age greater than something
    @GetMapping("/GetUserFindByName/{name}/{age}")
    public List<Users> getUserByName(@PathVariable String name , @PathVariable Integer age){
        return userservice.findUserGreaterThanAgeFactor(name , age);
    }
    //And find something and get age grater than something
    @GetMapping("/GetUserFindByNameAndAge")
    public List<Users> GetUserFindByNameAndAge(@RequestParam String name , @RequestParam Integer age){
        return userservice.findUserAndGreaterThanAgeFactor(name , age);
    }

    // costum query : nativeQuery

    @GetMapping("/userSort")
    public List<Users> getAllByNativeQuery(){
        return userservice.getUserByNativeQuery();
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

    @GetMapping("/userWhere/{age}")
    public List<Users> getAllUsersWhere(@PathVariable int age){
        return userservice.getAllUsersWhereAg(age);
    }

}
