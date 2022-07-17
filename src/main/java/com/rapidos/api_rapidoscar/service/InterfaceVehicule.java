package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Location;

import java.util.List;

public interface InterfaceVehicule {

    Location save(Location location);

    void delete(Integer id);

    Location update(Location location, Integer id);

    List<Location> getAll();
}
