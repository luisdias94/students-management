package com.example.student_managementsystem.repository;

import com.example.student_managementsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {


}
