package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Client;
import com.rapidos.api_rapidoscar.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient implements InterfaceClient {

    private ClientRepository clientRepository;

    public ServiceClient(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
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
        return clientRepository.findAll();
    }
}
