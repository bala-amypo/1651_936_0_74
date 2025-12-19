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
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.List;

@RestController
public class StudentController{

    @Autowired StudentService sert;



    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return sert.postData(stu);


    }
    @GetMapping("/get")
    public List<StudentEntity> getval(){
        return sert.getAllData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteVal(@PathVariable int id){
        return sert.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public StudentEntity getDataid(@PathVariable int id){
        return sert.getData(id);
    }
    // @PutMapping("/put/{id}")
    // public StudentEntity putval(@PathVariable int id,@RequestBody StudentEntity entity){
    //     return sert.updateData(id,entity);
    // }

}