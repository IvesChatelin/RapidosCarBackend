package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLocation implements InterfaceLocation {
    @Override
    public Location save(Location location) {
        return null;
    }

    @Override
    public Location update(Location location, Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Location> getAll() {
        return null;
    }
}
