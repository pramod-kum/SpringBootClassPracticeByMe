package com.geekster.Student.Course.controllers;

import com.geekster.Student.Course.models.Student;
import com.geekster.Student.Course.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/course/{id}")
    public ResponseEntity<List<Student>> getStudentByCourseId(@PathVariable Long id){
        List<Student> myStudent = studentService.getStudentByCourseId(id);

        if(myStudent.size()==0){
            //204
            throw new IllegalStateException("Minak is testing messages");
           // return new ResponseEntity<List<Student>>(myStudent, HttpStatus.NO_CONTENT);

        }else {
            //200
            return new ResponseEntity<List<Student>>(myStudent, HttpStatus.OK);
        }
    }

}
