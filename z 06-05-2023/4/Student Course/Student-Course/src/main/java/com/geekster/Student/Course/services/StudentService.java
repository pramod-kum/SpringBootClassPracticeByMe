package com.geekster.Student.Course.services;

import com.geekster.Student.Course.models.Student;
import com.geekster.Student.Course.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
   private IStudentRepo studentRepo;

    public List<Student> getStudentByCourseId(Long id) {
        return studentRepo.getStudentByCourseID(id);
    }
}
