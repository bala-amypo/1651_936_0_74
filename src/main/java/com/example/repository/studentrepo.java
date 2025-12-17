package com.example.demo.repository;
import org.springframework.stereotype.Repository;
@Repository
public interface studentrepo extends JpaRepository<StudentEntity,Integer>{
     
}