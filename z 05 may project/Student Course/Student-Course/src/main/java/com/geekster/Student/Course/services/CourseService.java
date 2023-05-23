package com.geekster.Student.Course.services;

import com.geekster.Student.Course.models.Course;
import com.geekster.Student.Course.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo courseRepo;

    public void addCourse(Course myCourse) {
        courseRepo.save(myCourse);
    }
}
