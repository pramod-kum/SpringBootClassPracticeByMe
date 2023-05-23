package com.geekster.H2fun.repository;

import com.geekster.H2fun.models.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository <Users, Integer> {
    //Get by name
    public List<Users> findByName(String name);

    //Get above certain age
    public ArrayList<Users> findByAgeGreaterThan(Integer age);

    //Or
    public ArrayList<Users> findByNameOrAgeGreaterThan(String name , Integer gge);
    //And
    public ArrayList<Users> findByNameAndAgeGreaterThan(String name , Integer gge);

    //make your own queries
    @Query(value = "select * from Users order by user_age asc" , nativeQuery = true)
    public List<Users> findUsersOrderedByAgeASC();

//    @Query(value = "select * from Users where user_age = ?1 order by user_age asc" , nativeQuery = true)
//    public List<Users> findUsersOrderedByAgeASCWithWhere(Integer age);
    @Query(value = "select * from Users where user_age = :age order by user_age asc" , nativeQuery = true)
    public List<Users> findUsersOrderedByAgeASCWithWhere(Integer age);
}
