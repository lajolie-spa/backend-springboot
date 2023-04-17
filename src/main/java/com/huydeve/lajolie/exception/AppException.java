package com.huydeve.lajolie.exception;

import com.huydeve.lajolie.common.MessageResponse;
import com.huydeve.lajolie.contant.StatusCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class AppException extends Error{
    StatusCode appCode;
    HttpStatus httpCode;

    public AppException(StatusCode appCode, HttpStatus httpCode) {
        super(MessageResponse.MESSAGE.get(appCode));
        this.appCode = appCode;
        this.httpCode = httpCode;
    }
}
