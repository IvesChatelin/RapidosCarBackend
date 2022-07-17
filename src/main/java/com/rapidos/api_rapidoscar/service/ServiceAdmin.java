package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAdmin implements InterfaceAdmin {
    @Override
    public Admin save(Admin admin) {
        return null;
    }

    @Override
    public Admin update(Admin admin, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Admin> getAll() {
        return null;
    }
}
