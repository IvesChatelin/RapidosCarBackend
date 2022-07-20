package com.rapidos.api_rapidoscar.controller;

import com.rapidos.api_rapidoscar.models.JwtResponce;
import com.rapidos.api_rapidoscar.models.LoginModel;
import com.rapidos.api_rapidoscar.repository.UserRepository;
import com.rapidos.api_rapidoscar.security.JwtProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("auth")
public class AuthController {

    AuthenticationManager authenticationManager;

    UserRepository userRepository;

    JwtProvider jwtProvider;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody() LoginModel loginModel){
        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginModel.getUserName(),
                        loginModel.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(auth);
        String jwt = jwtProvider.generateJwtToken(auth);
        return ResponseEntity.ok(new JwtResponce(jwt));
    }

    @GetMapping("/login")
    public void logout(){

    }
}
