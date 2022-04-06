package com.example.demo.exception;

/**
 * by Aksenchenko Serhii on 06.04.2022
 */
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Couldn't find employe id : " + id);
    }
}
