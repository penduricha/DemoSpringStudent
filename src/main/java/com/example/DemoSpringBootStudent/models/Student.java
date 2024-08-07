package com.example.DemoSpringBootStudent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;
@Getter
@Entity
@Data
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    @Id
    private Long id;
    private String name;
    private int age;
    private double mark;
}
