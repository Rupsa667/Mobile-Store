package com.example.Exception;

public class MobileNotFoundException extends RuntimeException {
    public MobileNotFoundException(String message) {
        super(message);
    }
}
