package com.example.demo.service;

import com.example.demo.domain.Credentials;

import java.sql.SQLInvalidAuthorizationSpecException;

public interface SecurityService {
    Credentials processToken(String token) throws Exception;

    String createToken(Credentials credentials) throws Exception;

}
