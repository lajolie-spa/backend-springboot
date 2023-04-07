package com.huydeve.lajolie.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@SecurityRequirement(name = "Bearer Authentication")
public class UserController {
    @GetMapping
    public GreetResponse greet() {
      GreetResponse greetResponse = new GreetResponse(
              "Hello", List.of("Java"),
              new Person("Alex"));

        return greetResponse;
    }
    record Person(String name) {

    }
    record GreetResponse(String greet,
                         List<String> fav,
                         Person person
                         ) {

    }

}
