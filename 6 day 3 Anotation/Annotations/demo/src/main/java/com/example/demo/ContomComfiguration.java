package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ComponentScanTest"})
public class ContomComfiguration {
    @Bean
    public Student getStudent(){
        System.out.println("Spring call.. in config bean of student");
        return new Student("Satyam jaiswal");
    }
}
