package com.dealership.apispringbootdealership.exceptions.notfound;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
