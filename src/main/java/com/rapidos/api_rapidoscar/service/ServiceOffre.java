package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Offrelocation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOffre implements InterfaceOffre {
    @Override
    public Offrelocation save(Offrelocation offre) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Offrelocation update(Offrelocation offre, Integer id) {
        return null;
    }

    @Override
    public List<Offrelocation> getAll() {
        return null;
    }
}
