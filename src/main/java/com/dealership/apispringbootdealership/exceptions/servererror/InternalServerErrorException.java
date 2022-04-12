package com.dealership.apispringbootdealership.exceptions.servererror;

public class InternalServerErrorException extends RuntimeException{
    public InternalServerErrorException(String message) {
        super(message);
    }
}

