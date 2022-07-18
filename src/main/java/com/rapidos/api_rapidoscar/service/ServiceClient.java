package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.User;
import com.rapidos.api_rapidoscar.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient implements InterfaceClient {

    private UserRepository clientRepository;

    public ServiceClient(UserRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public User save(User user) {
        return clientRepository.save(user);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public User update(User user, Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return clientRepository.findAll();
    }
}
