package com.huydeve.lajolie.utils;

import com.google.gson.Gson;
import com.huydeve.lajolie.common.HttpResponse;

public class Json {
    public static String convertToJson(HttpResponse httpResponse){
        Gson gson = new Gson();
        return gson.toJson(httpResponse);
    }
}
