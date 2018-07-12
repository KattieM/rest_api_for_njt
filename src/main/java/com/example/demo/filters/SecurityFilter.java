package com.example.demo.filters;

import com.example.demo.domain.Credentials;
import com.example.demo.service.SecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class SecurityFilter implements Filter{

    private static final Logger logger = LoggerFactory.getLogger(SecurityFilter.class);

    @Autowired
    SecurityService securityService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter) throws IOException, ServletException {
        logger.info("HTTP REQUEST");

        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpResponse.addHeader("Access-Control-Allow-Methods", "GET,PUT,PATCH,DELETE,POST,OPTIONS");
        httpResponse.addHeader("Access-Control-Max-Age", "3600");
        httpResponse.addHeader("Access-Control-Allow-Headers",
                "Origin, x-requested-with, X-AUTH-TOKEN, Content-Type, Accept");

        String uri = httpRequest.getRequestURI();

        if (uri.equals("/user/get-token") || uri.equals("/status/test") || uri.equals("/favicon.ico")) {
            logger.info("NO SECURE NEEDED FOR THIS API REQUEST : {} ", httpRequest.getRequestURI().toString());
            filter.doFilter(request, response);
        } else {
            logger.info("URL: {}", httpRequest.getRequestURL());
            logger.info("METHOD TYPE: {}", httpRequest.getMethod());
            logger.info("USER TOKEN NEEDED FOR THIS API CALL : {} ", httpRequest.getRequestURI().toString());
            Credentials credentials;
            try {
                String token = httpRequest.getHeader("X-AUTH-TOKEN");
                credentials = securityService.processToken(token);
            } catch (Exception e) {
                credentials = null;
                httpResponse.setStatus(401);
                logger.error("SecurityService exception: {} " + e.getMessage());
            }
            if (credentials != null) {
                filter.doFilter(request, response);
            }
        }


    }

    @Override
    public void destroy() {

    }
}
