package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface  StudService {
    List<Student> findAllStudents();
    Student findAllStudentsById(Long id);
    Student saveStudent(Student s);
    void deleteStudentById(Long id);
    void deleteAll();
    void updateStudent(Student s);
}
