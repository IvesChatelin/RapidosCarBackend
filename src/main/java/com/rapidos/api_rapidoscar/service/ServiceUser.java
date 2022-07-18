package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.User;
import com.rapidos.api_rapidoscar.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUser implements InterfaceUser {

    private UserRepository userRepository;

    public ServiceUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
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
        return userRepository.findAll();
    }
}
