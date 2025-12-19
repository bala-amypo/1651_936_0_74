package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotion.RestControllerAdvice;
import org.springframework.web.bind.annotion.ExceptionHandler;
import org.springframework.http.ResponseEntity;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException)
    public ResponseEntity<String> handleValidationException(ValidationException ex){
        return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
    }

}