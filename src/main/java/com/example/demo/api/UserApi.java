package com.example.demo.api;

import com.example.demo.dao.CredentialsRepository;
import com.example.demo.domain.Credentials;
import com.example.demo.service.SecurityService;
import com.example.demo.service.impl.SecurityServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    CredentialsRepository userDao;

    @Autowired
    private SecurityServiceImpl securityService;

    @RequestMapping(value="/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody Credentials user, HttpServletRequest httpServletRequest) throws JsonProcessingException, Exception{
        System.out.println("trying to authenticate user");
        String token = securityService.authenticateUser(user);
        user = userDao.findByUsername(user.getUsername());
        return "{\"userId\":\""+user.getId()+"\",\"token\":\""+token+"\"}";

    }




}
