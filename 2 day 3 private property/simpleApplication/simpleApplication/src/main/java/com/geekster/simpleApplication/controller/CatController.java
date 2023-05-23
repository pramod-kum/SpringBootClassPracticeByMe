package com.geekster.simpleApplication.controller;
import com.geekster.simpleApplication.model.Student;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class CatController {
    @GetMapping(value = "/cat")
    public String getCatInfo(){
        String message = "This is the Information about cat";
        return message;
    }
    @PostMapping(value = "/cat")
    public String saveCat(@RequestBody Student studentObj){
        System.out.println(studentObj.getStudentId());
        System.out.println(studentObj.getFirstName());
        System.out.println(studentObj.getLastName());

        return "Saved- "+ studentObj;
    }

}
