package com.geekster.simpleApplication.controller;
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
    public String saveCat(@RequestBody String requestData){
        JSONObject jsonObject = new JSONObject(requestData);
      String name = jsonObject.getString("name");
      String username = jsonObject.getString("username");
      int age = jsonObject.getInt("age");

        System.out.println(name + " " + username + " " + age);
        return "Saved- "+ requestData;
    }

}
