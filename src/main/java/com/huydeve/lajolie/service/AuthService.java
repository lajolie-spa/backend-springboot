package com.huydeve.lajolie.service;

import com.huydeve.lajolie.model.User;
import com.huydeve.lajolie.payload.request.AuthenticationRequest;
import com.huydeve.lajolie.payload.request.RegisterRequest;
import com.huydeve.lajolie.payload.response.AuthenticationResponse;

public interface AuthService {
    public AuthenticationResponse register(RegisterRequest request);
    public AuthenticationResponse authenticate(AuthenticationRequest request);

}
