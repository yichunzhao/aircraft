package com.ynz.democonfigproperties.aircraft;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ConstraintViolationException.class})
    public ResponseEntity<Set<String>> handleConstraintViolationException(ConstraintViolationException exception) {
        return ResponseEntity.badRequest()
                .body(exception.getConstraintViolations().stream().map(x -> x.getMessage()).collect(toSet()));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){
        return ResponseEntity.badRequest().body(exception.getBindingResult().getAllErrors().stream()
                .map(objectError -> objectError.getDefaultMessage()).collect(toList()));
    }
}
