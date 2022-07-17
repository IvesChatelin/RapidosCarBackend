package com.rapidos.api_rapidoscar.controller;

import com.rapidos.api_rapidoscar.entity.Client;
import com.rapidos.api_rapidoscar.service.ServiceClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private ServiceClient serviceClient;

    public ClientController(ServiceClient serviceClient) {
        this.serviceClient = serviceClient;
    }

    @GetMapping("/")
    public ResponseEntity<List<Client>> getAll(){
        try{
            return new ResponseEntity<>(serviceClient.getAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Client> addClient(@RequestBody() Client client){
        try{
            return new ResponseEntity<>(serviceClient.save(client), HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
