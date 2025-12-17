package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.respository.JpaRepository;
import com.example.demo.entity.StudentEntity;
@Repository
public interface studentrepo extends JpaRepository<StudentEntity,Integer>{
     
}