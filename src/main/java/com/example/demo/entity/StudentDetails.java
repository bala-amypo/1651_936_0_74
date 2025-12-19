package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String name;
    private String email;
    private String address;
               
}
