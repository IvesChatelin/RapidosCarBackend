package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient implements InterfaceClient {


    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Client update(Client client, Integer id) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }
}
