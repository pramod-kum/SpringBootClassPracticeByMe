package com.geekster.Student.Course.controllers;

import com.geekster.Student.Course.models.Course;
import com.geekster.Student.Course.models.Student;
import com.geekster.Student.Course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
   private CourseService courseService;

    @PostMapping(value = "/")
    public void createCourse(@RequestBody Course myCourse){
        courseService.addCourse(myCourse);
    }

    @GetMapping(value = "stusent/{courseId}")
    public List<Student> getStudentByCourseID(@PathVariable Long courseId){
        return courseService.getStudentByCourseID(courseId);
    }
}
