package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Object Creation through Configuration and Bean Anotation
public class ContomComfiguration {
    @Bean
    public Student getStudent(){
        System.out.println("Spring call.. in config bean of student");
        return new Student("Pramod Kumar");
    }
}
