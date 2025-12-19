package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class StudentIdDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String idcardnumber;
    private String student_id;
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentDetails student;
               
}
