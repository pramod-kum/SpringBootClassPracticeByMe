package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ComponentScanTest"})
public class ContomComfiguration {
    @Bean("Satyam")
    public Student getStudent1(){
        System.out.println("Spring call.. in config bean of student");
        return new Student("Satyam jaiswal");
    }
    @Bean("Hitarth")
    public Student getStudent2(){
        System.out.println("Spring call.. in config bean of student00");
        return new Student("hitarth Singh");
    }
}
