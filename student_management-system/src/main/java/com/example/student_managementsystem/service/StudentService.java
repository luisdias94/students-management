package com.example.student_managementsystem.service;

import com.example.student_managementsystem.model.Student;

import java.util.List;

public interface StudentService {
 List<Student> getAllStudents();

 Student saveStudent(Student student);

 Student getStudentById(Integer id);
 Student updateStudent(Student student);

 void deleteStudentById(Integer id);


}
