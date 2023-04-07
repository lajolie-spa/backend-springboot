package com.huydeve.lajolie.service;

public interface RefreshTokenService {
    public String generateRefreshToken(String username);
    public String getRefreshToken(String username);
    public void deleteRefreshToken(String username);
}
