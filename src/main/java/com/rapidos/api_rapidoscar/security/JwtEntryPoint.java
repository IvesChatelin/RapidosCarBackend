package com.rapidos.api_rapidoscar.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtEntryPoint implements AuthenticationEntryPoint {

    public static final Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        logger.error("Erreur d'authorisation -> Message: {}", authException.getMessage());
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED,"erreur -> non authorisé");
    }
}
