package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class StudentIdCard{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;
    private String idcardnumber;
    private String student_id;
               
}
