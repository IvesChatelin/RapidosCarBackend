package com.rapidos.api_rapidoscar.controller;

import com.rapidos.api_rapidoscar.entity.User;
import com.rapidos.api_rapidoscar.service.ServiceClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class UserController {

    private ServiceClient serviceClient;

    public UserController(ServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll(){
        try{
            return new ResponseEntity<>(serviceClient.getAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<User> addClient(@RequestBody() User user){
        try{
            return new ResponseEntity<>(serviceClient.save(user), HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
