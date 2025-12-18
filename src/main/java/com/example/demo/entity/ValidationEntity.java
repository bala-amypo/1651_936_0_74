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
    @Size(min=2, max=10, message="must be 2 to 10 character")
    private String name;
    @Email(message="Email is not valid")
    private String email;
    @Size(6)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    private Integer age;
}