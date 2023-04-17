package com.huydeve.lajolie.common;

import com.google.gson.Gson;
import com.huydeve.lajolie.contant.StatusCode;

public class HttpResponseBuilder<T> {
    private StatusCode statusCode;
    private String message;
    private T data;

    public HttpResponseBuilder<T> withStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public HttpResponseBuilder<T> withMessage(String message) {
        this.message = message;
        return this;
    }

    public HttpResponseBuilder<T> withData(T data) {
        this.data = data;
        return this;
    }

    public HttpResponse<T> build() {

        HttpResponse<T> httpResponse = new HttpResponse<>();
        httpResponse.setStatusCode(statusCode);
        httpResponse.setMessage(message);
        httpResponse.setData(data);
        return httpResponse;
    }


}
