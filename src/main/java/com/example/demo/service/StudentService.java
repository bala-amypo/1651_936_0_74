package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.List;
public interface StudentService{
    studententity postData(StudentEntity stu);
    List<StudentEntity>getAllData();
}