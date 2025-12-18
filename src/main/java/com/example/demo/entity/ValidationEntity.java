package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ValidationEntity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private Integer id;
    @NotNull
    @Size(min=2, max=0, message="must be 2 to 10 character")
    private String name;
    private String email;
    private String password;
    private Integer age;
}