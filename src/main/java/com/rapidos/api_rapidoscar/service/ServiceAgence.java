package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Agence;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAgence implements InterfaceAgence {
    @Override
    public Agence save(Agence agence) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Agence update(Agence agence, Integer id) {
        return null;
    }

    @Override
    public List<Agence> getAll() {
        return null;
    }
}
