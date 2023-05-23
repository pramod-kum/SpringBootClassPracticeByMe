package com.geekster.Student.Course.services;

import com.geekster.Student.Course.models.Course;
import com.geekster.Student.Course.models.Student;
import com.geekster.Student.Course.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo courseRepo;

    public void addCourse(Course myCourse) {
        courseRepo.save(myCourse);
    }

    public List<Student> getStudentByCourseID(Long courseId) {
        Optional<Course> mycourse = courseRepo.findById(courseId);
        System.out.println("Minak is liar");
        Course course = mycourse.get();
        return course.getStudent();
    }
}
