package com.example.DemoSpringBootStudent.services;

import com.example.DemoSpringBootStudent.models.Student;

import java.util.List;

public interface I_StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
