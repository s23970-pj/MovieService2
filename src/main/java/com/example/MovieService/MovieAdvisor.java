package com.example.MovieService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieAdvisor {

@ExceptionHandler(ExceptionNotFound.class) //.class zwraca typ klas
    public ResponseEntity<String> handleExceptionNotFound(ExceptionNotFound ex){
    return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body("NOT FOUND" + ex.getLocalizedMessage());
}

}
