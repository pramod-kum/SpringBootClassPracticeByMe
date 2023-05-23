package com.geekster.Student.Course.controllers;

import com.geekster.Student.Course.models.Student;
import com.geekster.Student.Course.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Student> getStudentByCourseId(@PathVariable Long id){
        return studentService.getStudentByCourseId(id);
    }

}
