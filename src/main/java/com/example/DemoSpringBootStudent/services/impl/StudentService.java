package com.example.DemoSpringBootStudent.services.impl;

import com.example.DemoSpringBootStudent.models.Student;
import com.example.DemoSpringBootStudent.repositories.StudentRepository;
import com.example.DemoSpringBootStudent.services.I_StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements I_StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) throws JpaSystemException {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        //DESC
    }
}
