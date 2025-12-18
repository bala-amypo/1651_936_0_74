package com.example.demo.service.Impl;
import org.springframework.sterotype.service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Impl implements StudentService{
@Autowired StudentRepo student;
//save()
//findall()
//findbyid()
//deletebyid()
//existsbyit()
public StudentEntity postValue(StudentEntity stu){
    return student.save(stu);
}
@Override
 public List<StudentEntity>getAllData(){
    return student.findAll();
 }
}