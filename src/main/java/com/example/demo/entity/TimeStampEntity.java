package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy="GenerationType.IDENTITY")
    private long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    public Time StampEntity{

    }
    public TimeStampEntity(){

    }
}