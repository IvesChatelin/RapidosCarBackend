package com.rapidos.api_rapidoscar.service;

import com.rapidos.api_rapidoscar.entity.Agence;

import java.util.List;

public interface InterfaceAgence {

    Agence save(Agence agence);

    void delete(Integer id);

    Agence update(Agence agence, Integer id);

    List<Agence> getAll();
}
