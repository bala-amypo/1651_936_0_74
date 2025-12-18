package com.example.demo.exception;

public clas ValidationException extends RunTimeException{


    public ValidationException(String message){
        super(message);
         public StudentEntity getData(int id){
            return student.findById(id).orElse(null);
        }
        
    }

}