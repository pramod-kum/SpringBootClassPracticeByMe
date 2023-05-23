package com.geekster.H2fun.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Users {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "user_name" , unique = true)
    private String name;
    @Column(name = "user_age")
    private Integer age;
    @Column(name = "date_of_birth")
    private LocalDate dob;
}
