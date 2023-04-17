package com.huydeve.lajolie.advice;

import com.huydeve.lajolie.common.HttpResponse;
import com.huydeve.lajolie.common.MessageResponse;
import com.huydeve.lajolie.contant.StatusCode;
import com.huydeve.lajolie.exception.auth.InvalidLoginCredentialsException;
import com.huydeve.lajolie.utils.Json;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({InvalidLoginCredentialsException.class})
    public String handleInvalidLoginCredentialsException(InvalidLoginCredentialsException e) {
        return Json.convertToJson(HttpResponse.builder().withMessage(e.getMessage()).withStatusCode(e.getAppCode()).build());
    }

}
