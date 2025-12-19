package com.example.demp.exception;
public class ValidationException extends RuntimeException{
    public ValidationException(String message){
        super(message);
    }
}