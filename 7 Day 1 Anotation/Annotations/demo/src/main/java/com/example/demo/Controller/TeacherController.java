package com.example.demo.Controller;

import ComponentScanTest.Teacher;
import com.example.demo.teacherservicePackage.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller

public class TeacherController {

    @Autowired
    Teacherservice t1;

    @ResponseBody
    @RequestMapping(value = "/teach",method = RequestMethod.GET)
    public String teach(){
       return t1.teacherServiceCall();
    }
}
