package com.ashitsathish.restdemoapp.exceptionhandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timeStamp;


    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
