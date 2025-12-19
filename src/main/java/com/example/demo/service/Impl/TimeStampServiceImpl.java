package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepo;
import com.example.demo.service.TimeStampService;
import java.util.List;
@Service
public class StudentServiceImpl implements TimeStampService {
    @Autowired TimeStampRepo student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existByid();
        @Override
        public TimeStampEntity postData(TimeStampEntity stu){
            return student.save(stu);
        }   
}
