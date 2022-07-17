package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Client;

import java.util.List;

public interface InterfaceClient {

    Client save(Client client);

    void delete(Integer id);

    Client update(Client client, Integer id);

    List<Client> getAll();
}
