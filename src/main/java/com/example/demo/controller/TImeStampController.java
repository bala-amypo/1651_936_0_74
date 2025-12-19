package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.service.TimeStampService;
import com.example.demo.service.TimeStampEntity;
import java.util.List;

@RestController
public class TimeStampController{

    @Autowired TimeStampService ser;



    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody TimeStampEntity stu){
        return ser.postData(stu);


    }
}    