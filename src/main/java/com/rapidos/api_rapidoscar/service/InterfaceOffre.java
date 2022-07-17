package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Offrelocation;

import java.util.List;

public interface InterfaceOffre {

    Offrelocation save(Offrelocation offre);

    void delete(Integer id);

    Offrelocation update(Offrelocation offre, Integer id);

    List<Offrelocation> getAll();
}
