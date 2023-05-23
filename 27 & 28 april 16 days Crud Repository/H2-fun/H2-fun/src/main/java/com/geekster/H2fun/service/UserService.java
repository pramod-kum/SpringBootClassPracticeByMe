package com.geekster.H2fun.service;

import com.geekster.H2fun.models.Users;
import com.geekster.H2fun.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;
    public Iterable<Users> getAllUsers() {
        Iterable<Users> allUsers = userRepository.findAll();
        return allUsers;
    }

    public String addUsers(List<Users> userList) {
        Iterable<Users> addedUsers = userRepository.saveAll(userList);
        if (addedUsers != null)
            return "YES";
        else
            return "NO";
    }

    public void removeUserById(Integer id) {
        userRepository.deleteById(id);
    }

    public List<Users> fetchUserByName(String name) {
        return userRepository.findByName(name);
    }

    public ArrayList<Users> fetchUserGreaterByAgeFactor(Integer age) {
        return userRepository.findByAgeGreaterThan(age);
    }

    public List<Users> findUserGreaterThanAgeFactor(String name, Integer age) {
        return userRepository.findByNameOrAgeGreaterThan(name , age);
    }
    public List<Users> findUserAndGreaterThanAgeFactor(String name, Integer age) {
        return userRepository.findByNameAndAgeGreaterThan(name , age);
    }

    public List<Users> getUserByNativeQuery() {
        return userRepository.findUsersOrderedByAgeASC();
    }

    public List<Users> getAllUsersWhereAg(int age) {
        return userRepository.findUsersOrderedByAgeASCWithWhere(age);
    }
}
