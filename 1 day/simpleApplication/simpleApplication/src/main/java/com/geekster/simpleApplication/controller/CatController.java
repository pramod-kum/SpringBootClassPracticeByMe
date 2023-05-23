package com.geekster.simpleApplication.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {
    @GetMapping(value = "/cat")
    public String getCatInfo(){
        String message = "This is the Information about cat";
        return message;
    }

}
