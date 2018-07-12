package com.example.demo.api;

import com.example.demo.domain.Credentials;
import com.example.demo.service.SecurityService;
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
    private static Logger logger = LoggerFactory.getLogger(UserApi.class);

    @Autowired
    SecurityService securityService;


    @RequestMapping(value = "/get-token", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Boolean getToken(@RequestBody Credentials credentials, HttpServletRequest httpServletRequest) throws Exception {
        logger.info("API REQUEST -- USER -- GET TOKEN");
        logger.info("Request params:\n{}", credentials.toString());
//        Credentials user = securityService.processToken(httpServletRequest.getHeader("X-AUTH-TOKEN"));
//        if(!user.getUsername().equals("poserAdmir") || !user.getPassword().equals("poser23")
//                || !user.getCompany().equals("netcast")){
//            logger.info("User isn't admin");
//            throw new AuthorizationException("Admin privileges needed for this request.");
//        }

        String token = securityService.createToken(credentials);
        return true;
    }

}
