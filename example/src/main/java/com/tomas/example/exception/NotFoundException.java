package com.tomas.example.exception;


public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {

        super(message);

    }

}