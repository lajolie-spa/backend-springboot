package com.huydeve.lajolie.exception;

import com.huydeve.lajolie.contant.StatusCode;
import org.springframework.http.HttpStatus;

public class AppUnexpectedException extends AppException{
    public AppUnexpectedException() {
        super(StatusCode.UNEXPECTED, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
