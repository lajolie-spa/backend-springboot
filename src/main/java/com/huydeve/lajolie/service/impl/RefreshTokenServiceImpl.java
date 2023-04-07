package com.huydeve.lajolie.service.impl;

import com.huydeve.lajolie.service.RefreshTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class RefreshTokenServiceImpl implements RefreshTokenService {
    @Value("${token.jwtRefreshExpirationMs}")
    private long REFRESH_TOKEN_EXP_IN_MS;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public String generateRefreshToken(String username) {
        String refreshToken = UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(username, refreshToken, REFRESH_TOKEN_EXP_IN_MS, TimeUnit.MILLISECONDS);
        return refreshToken;
    }

    public String getRefreshToken(String username) {
        return redisTemplate.opsForValue().get(username);
    }

    public void deleteRefreshToken(String username) {
        redisTemplate.delete(username);
    }
}
