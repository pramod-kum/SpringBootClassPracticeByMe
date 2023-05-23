package com.geekster.Student.Course.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course_table")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private Integer courseDurationInMonths;
    @Enumerated(value = EnumType.STRING)
    private CourseType courseType;
    private Double courseFee;
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_student_student_id")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_course_course_id")
    private List<Student> student;
}
