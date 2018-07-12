package com.example.demo.service.impl;

import com.example.demo.dao.CredentialsRepository;
import com.example.demo.domain.Credentials;
import com.example.demo.service.SecurityService;
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

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;
import java.util.Optional;

@Service
public class SecurityServiceImpl implements SecurityService{
    @Autowired
    private CredentialsRepository credentialsRepository;

    @Autowired
    private TokenProcessingService tokenProcessingService;

    public String authenticateUser(Credentials user) throws JsonProcessingException, Exception {
        Credentials userDb = credentialsRepository.findByUsername(user.getUsername());

        if(userDb == null){
            throw new IllegalArgumentException("NO_SUCH_USER");
        }
        //User localUser = users.get(0);

        if(!user.getPassword().equals(userDb.getPassword())){
            throw new Exception();
        }

        return tokenProcessingService.createToken(userDb);
    }

    public Credentials authenticateHttpRequest(HttpServletRequest httpServletRequest) throws JsonParseException, JsonMappingException, IOException{
        return tokenProcessingService.authenticateRequest(httpServletRequest);
    }

}
