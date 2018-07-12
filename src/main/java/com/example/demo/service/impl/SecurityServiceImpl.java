package com.example.demo.service.impl;

import com.example.demo.dao.CredentialsRepository;
import com.example.demo.domain.Credentials;
import com.example.demo.service.SecurityService;
import com.fasterxml.jackson.core.JsonProcessingException;
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
import java.util.Optional;

@Service
public class SecurityServiceImpl implements SecurityService{
    private static final Logger logger = LoggerFactory.getLogger(SecurityService.class);

    private final String key = "NAPREDNEJAVATEHNOLOGIJE";

    @Autowired
    CredentialsRepository credentialsRepository;


    @Override
    public Credentials processToken(String token) throws Exception {
        Claims userToken = null;
        try {
            userToken = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
        ObjectMapper mapper = new ObjectMapper();
        String tokenDataJSON = userToken.getSubject();
        Credentials credentials = null;
        try {
            credentials = mapper.readValue(tokenDataJSON, Credentials.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception();
        }

        Optional<Credentials> credentialsOptional = credentialsRepository.findById(credentials.getId());
        Credentials credCheck = null;
        if(credentialsOptional.isPresent()!=false)
            credCheck = credentialsOptional.get();

        if (credCheck == null || !credentials.equals(credCheck)) {
            logger.info("Wrong user:\nusername: {},\npassword: {}", credentials.getUsername(),
                    credentials.getPassword());
            throw new Exception();
        }

        logger.info("User is ok:\nusername: {},\npassword: {}", credentials.getUsername(),
                credentials.getPassword());
        return credentials;

    }

    @Override
    public String createToken(Credentials credentials) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Date expiration = new Date(2030, 1, 1);
        credentialsRepository.save(credentials);
        System.out.println(credentials.getId());
        try {
            return Jwts.builder().setSubject(mapper.writeValueAsString(credentials)).setExpiration(expiration)
                    .signWith(SignatureAlgorithm.HS512, key).compact();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new Exception();
        }

    }
}
