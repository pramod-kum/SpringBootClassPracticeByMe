package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ContomComfiguration {
    @Bean
    public Student getStudent(){
        System.out.println("Spring call.. in config bean of student");
        return new Student("Satyam jaiswal");
    }
}
