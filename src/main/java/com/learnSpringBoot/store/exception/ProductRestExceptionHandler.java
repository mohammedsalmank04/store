package com.learnSpringBoot.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductRestExceptionHandler {

    // Add exception handling code

    @ExceptionHandler
    public ResponseEntity<ProductErrorResponse> handleException(Exception exc){
        // Create a productErrorResponse

        ProductErrorResponse error = new ProductErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage("Enter Integer Value");
        error.setTimeStamp(System.currentTimeMillis());



        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
