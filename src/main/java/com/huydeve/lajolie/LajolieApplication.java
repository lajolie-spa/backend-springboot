package com.huydeve.lajolie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LajolieApplication {

    public static void main(String[] args) {

        SpringApplication.run(LajolieApplication.class, args);
    }

}
