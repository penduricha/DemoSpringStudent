package com.example.DemoSpringBootStudent.controllers;

import com.example.DemoSpringBootStudent.models.Student;
import com.example.DemoSpringBootStudent.services.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
//http://localhost:8080/api/students
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getAllStudents() throws JpaSystemException{
        return studentService.getAllStudents();
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student) throws JpaSystemException {
        return studentService.saveStudent(student);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomer);
    }

}
