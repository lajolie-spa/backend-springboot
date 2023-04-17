package com.huydeve.lajolie.service.impl;

import com.huydeve.lajolie.exception.auth.InvalidLoginCredentialsException;
import com.huydeve.lajolie.model.Role;
import com.huydeve.lajolie.model.User;
import com.huydeve.lajolie.payload.request.AuthenticationRequest;
import com.huydeve.lajolie.payload.request.RegisterRequest;
import com.huydeve.lajolie.payload.response.AuthenticationResponse;
import com.huydeve.lajolie.repository.UserRepository;
import com.huydeve.lajolie.service.AuthService;
import com.huydeve.lajolie.service.RefreshTokenService;
import com.huydeve.lajolie.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;
    private Role defaultRole;

    private final RefreshTokenService refreshTokenService;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public void setDefaultRole(Role defaultRole) {
        this.defaultRole = defaultRole;
    }
    @Override
    public AuthenticationResponse register(RegisterRequest request) {

        System.out.println(defaultRole.getName());
        var user = User.builder()
                .name(request.getName())
                .email(request.getUsername())
                .role(defaultRole)
                .password(passwordEncoder.encode(request.getPassword()))
                .build();

        userRepository.save(user);
        var accessToken = tokenService.generateToken(user);
        var refreshToken = refreshTokenService.generateRefreshToken(request.getUsername());
        return AuthenticationResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {


        var user = userRepository.findByEmail(request.getUsername()).orElseThrow(()-> {
            throw new InvalidLoginCredentialsException();
        });

        if(!authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        ).isAuthenticated()){
            throw new InvalidLoginCredentialsException();
        }
        var accessToken = tokenService.generateToken(user);
        var refreshToken = refreshTokenService.generateRefreshToken(request.getUsername());
        revokeAllUserTokens(user);

        return AuthenticationResponse.builder()
                .accessToken(accessToken)
                .refreshToken(refreshToken)
                .build();
    }


    private void revokeAllUserTokens(User user) {
        refreshTokenService.deleteRefreshToken(user.getUsername());
    }
}
