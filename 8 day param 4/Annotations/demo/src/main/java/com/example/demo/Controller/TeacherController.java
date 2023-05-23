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

    //http://localhost:8080/teachParam?name=Pramod&age=25
    //request mapping

    @GetMapping(value = "/teachParam")
    @ResponseBody
    public String getTeachParam(@RequestParam String name , @RequestParam String age){
        System.out.println("The param name is :"+name);
        return "The param name is :"+name + age;
    }
//http://localhost:8080/teachPathVariable/Pramod/24
    //Path variable
    @GetMapping(value = "/teachPathVariable/{name}/{age}")
    @ResponseBody
    public String teachPathVariable(@PathVariable String name , @PathVariable String age){
        System.out.println("The param name is :"+name);
        return "The param name is :"+name + age;
    }
}
