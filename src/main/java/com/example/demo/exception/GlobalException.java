package com.example.demo.exception;
import org.springframework.web.bind.annotion.RestControllerAdvice;
import org.springframework.web.bind.annotion.ExceptionHandler;
import org.springframework.web.bind.annotion.ResponseBody;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException)
    public ResponseBody<String> handleValidationException(ValidationException){

    }

}