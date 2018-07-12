package com.example.demo.service.impl;

import com.example.demo.dao.CredentialsRepository;
import com.example.demo.domain.Credentials;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class TokenHandler {
    private String key = "NaPREDneJavATEHnoloGije";

    @Autowired
    private CredentialsRepository userDao;

    private static final Logger log = LoggerFactory.getLogger(TokenHandler.class);


    public Credentials processToken(String token) throws JsonParseException, JsonMappingException, IOException {
        Claims userToken = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        String user = userToken.getSubject();
        if (user != null) {
            //System.out.println("found SUser: " + email);
            return userDao.findByUsername(user);
        }
        return null;
    }

    public String createToken(Credentials user) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return Jwts.builder().setSubject(user.getUsername())
                .signWith(SignatureAlgorithm.HS512, key).compact();
    }

}
