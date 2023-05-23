package com.example.demo.Controller;

import ComponentScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
public class TeacherController {

    @Autowired
    Teacher t1;


    @ResponseBody
    @RequestMapping(value = "teach",method = RequestMethod.GET)
    public String teach(){
       return t1.teach();
    }

    //request mapping

    @GetMapping(value = "/teachParam")
    @ResponseBody
    public String getTeachParam(String name){
        System.out.println("The param name is :"+name);
        return "The param name is : "+name;
    }
}
