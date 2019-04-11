package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(StudController.URL_STUDENT)
public class StudController {
    public static final String URL_STUDENT = "/api/v1/student";

    private final StudService studService;

    public StudController(StudService studService) {
        this.studService = studService;
    }
    @GetMapping
    public List<Student> getAnimals() {
        return this.studService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return this.studService.findAllStudentsById(id);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student s) {
        return this.studService.saveStudent(s);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable long id){
        studService.deleteStudentById(id);
        System.out.println("Удалено!");
    }
    @DeleteMapping()
    public void deleteAll(){
        studService.deleteAll();
    }

    @PutMapping()
    public void updateStudent(@RequestBody Student s){
        this.studService.updateStudent(s);
    }

}
