package com.huydeve.lajolie.exception.auth;

import com.huydeve.lajolie.contant.StatusCode;
import com.huydeve.lajolie.exception.AppException;
import org.springframework.http.HttpStatus;

public class InvalidCredentialsException extends AppException {
    public InvalidCredentialsException() {
        super(StatusCode.INVALID_CREDENTIALS, HttpStatus.UNAUTHORIZED);
    }
}
