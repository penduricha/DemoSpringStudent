package com.example.DemoSpringBootStudent.controllers;

import com.example.DemoSpringBootStudent.models.Student;
import com.example.DemoSpringBootStudent.services.impl.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final StudentService studentService;

    public TestController(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("/postStudent")
    public String postData() throws Exception{
        //nap du lieu
        try{
            Student student1=new Student(1L,"Minh",10,10);
            Student student2=new Student(2L,"Nam",10,20);
            Student student3=new Student(3L,"Hoang",10,30);
            //insert data
            studentService.saveStudent(student1);
            studentService.saveStudent(student2);
            studentService.saveStudent(student3);
            return "Success";
        }catch(Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
