package com.tomas.example.exception;

public class InsufficientStockException extends RuntimeException {

    public InsufficientStockException(String message) {

        super(message);

    }

}
