package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudRep;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudServiceImpl implements StudService {
    private final StudRep studRep;

    public StudServiceImpl(StudRep studRep) {
        this.studRep = studRep;
    }


    @Override
    public List<Student> findAllStudents() {
        return this.studRep.findAll();
    }

    @Override
    public Student findAllStudentsById(Long id) {
        return this.studRep.findById(id).get();
    }

    @Override
    public Student saveStudent(Student s) {
        return this.studRep.save(s);
    }

    @Override
    public void deleteStudentById(Long id) {
       this.studRep.deleteById(id);
    }

    @Override
    public void deleteAll() {
      this.studRep.deleteAll();
    }

    @Override
    public void updateStudent(Student s) {
       this.studRep.save(s);
    }
}
