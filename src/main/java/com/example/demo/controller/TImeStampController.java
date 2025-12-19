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
import com.example.demo.entity.TimeStampEntity;
import java.util.List;

@RestController
public class TimeStampController{

    @Autowired TimeStampService serb;



    @PostMapping("/post3")
    public TimeStampEntity sentData1(@RequestBody TimeStampEntity stu1){
        return serb.postStamp(stu1);


    }
}    