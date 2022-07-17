package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Location;

import java.util.List;

public interface InterfaceLocation {

    Location save(Location location);

    Location update(Location location, Integer id);

    void delete(Integer id);

    List<Location> getAll();
}
