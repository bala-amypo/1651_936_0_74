package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ValidationEntity;
@Entity
public class ValidationEntity{
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Integer age;
}