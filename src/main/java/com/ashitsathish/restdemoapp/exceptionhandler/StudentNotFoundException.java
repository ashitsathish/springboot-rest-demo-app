package com.ashitsathish.restdemoapp.exceptionhandler;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
