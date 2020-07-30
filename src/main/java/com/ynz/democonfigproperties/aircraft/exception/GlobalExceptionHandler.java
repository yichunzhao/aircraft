package com.ynz.democonfigproperties.aircraft.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Set<String>> handleConstraintViolationException(ConstraintViolationException  exception){
        return ResponseEntity.badRequest()
                .body(exception.getConstraintViolations().stream().map(x->x.getMessage()).collect(toSet()));
    }
}
