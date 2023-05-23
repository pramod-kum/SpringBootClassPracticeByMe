package com.example.demo.teacherservicePackage;

import ComponentScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Teacherservice {
    @Autowired
    Teacher t1;

    public String teacherServiceCall(){
        return t1.teach();
    }
}
