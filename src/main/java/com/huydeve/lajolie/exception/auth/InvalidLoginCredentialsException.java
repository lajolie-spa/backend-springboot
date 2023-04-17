package com.huydeve.lajolie.exception.auth;

import com.huydeve.lajolie.contant.StatusCode;
import com.huydeve.lajolie.exception.AppException;
import org.springframework.http.HttpStatus;

public class InvalidLoginCredentialsException extends AppException {
    public InvalidLoginCredentialsException() {
        super(StatusCode.INVALID_LOGIN_CREDENTIALS, HttpStatus.UNAUTHORIZED);
    }
}
