package com.huydeve.lajolie.common;

import com.huydeve.lajolie.contant.StatusCode;

public class HttpResponse<T> {
    private StatusCode statusCode;

    private String message;

    private T data;

    public static <T> HttpResponseBuilder<T> builder() {
        return new HttpResponseBuilder<>();
    }

    public static <T> HttpResponse<T> success(T data) {
        return HttpResponse.<T>builder()
                .withStatusCode(StatusCode.OK)
                .withMessage(MessageResponse.MESSAGE.get(StatusCode.OK))
                .withData(data)
                .build();
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

