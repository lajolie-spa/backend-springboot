package com.huydeve.lajolie.controller;

import com.huydeve.lajolie.common.HttpResponse;
import com.huydeve.lajolie.payload.request.AuthenticationRequest;
import com.huydeve.lajolie.payload.request.RegisterRequest;
import com.huydeve.lajolie.payload.response.AuthenticationResponse;
import com.huydeve.lajolie.service.AuthService;
import com.huydeve.lajolie.service.RefreshTokenService;
import com.huydeve.lajolie.service.TokenService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;
    private AuthenticationManager authenticationManager;
    private TokenService tokenService;
    private RefreshTokenService refreshTokenService;


    @PostMapping(path = "/authenticate", produces = "application/json", consumes = "application/json")
    public HttpResponse<AuthenticationResponse> authenticate(
            @RequestBody( description= "Book to add.", required = true,
                    content = @Content(
                            schema=@Schema(implementation = AuthenticationRequest.class)))
            @Valid @org.springframework.web.bind.annotation.RequestBody AuthenticationRequest request
    ) {

        return HttpResponse.success(service.authenticate(request));
    }


    @PostMapping("/register")
    public HttpResponse<AuthenticationResponse> register(
            @RequestBody( description= "Book to add.", required = true,
                    content = @Content(
                            schema=@Schema(implementation = RegisterRequest.class)))
            @Valid @org.springframework.web.bind.annotation.RequestBody RegisterRequest request
    ) {
        System.out.println(request.getPassword());
        return HttpResponse.success(service.register(request));
    }
}
