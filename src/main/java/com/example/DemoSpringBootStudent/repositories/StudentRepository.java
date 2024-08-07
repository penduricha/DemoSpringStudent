package com.example.DemoSpringBootStudent.repositories;

import com.example.DemoSpringBootStudent.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Long> {
//query
}
