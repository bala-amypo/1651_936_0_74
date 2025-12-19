package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private Date created;

               
}
