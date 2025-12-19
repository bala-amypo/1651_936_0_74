package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private Date created;

               
}
