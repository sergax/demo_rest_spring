package com.example.demo.exception;

/**
 * by Aksenchenko Serhii on 06.04.2022
 */
public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(Long id) {
        super("Couldn't find employee id : " + id);
    }
}
