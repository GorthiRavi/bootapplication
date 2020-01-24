package com.boo.bootapplication.ExceptionHandler;

import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<Object> productNotFoundException(ProductNotFoundException exception){

        return new ResponseEntity<>("Product is not found", HttpStatus.NOT_FOUND);
    }
}
