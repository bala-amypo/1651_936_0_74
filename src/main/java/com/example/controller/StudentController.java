package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.RequestBody;
import org.springframework.beans.factory.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.studentService;

@RestController
public class StudentController{
    @Autowired studentservice ser;



    @PostMapping(/"post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }
}