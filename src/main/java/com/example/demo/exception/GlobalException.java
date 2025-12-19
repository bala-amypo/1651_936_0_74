package com.example.demo.exception;
import org.springframework.web.bind.annotion.RestController;
import org.springframework.web.bind.annotion.ExceptionHandler;

@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException)
    @Response

}